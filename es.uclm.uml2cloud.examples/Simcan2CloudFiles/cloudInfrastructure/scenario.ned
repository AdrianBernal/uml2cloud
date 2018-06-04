package simcan2.simulations.cloudInfrastructure;

import simcan2.Architecture.Nodes.Cloud.CloudBlade;
import simcan2.Architecture.Nodes.Cloud.CloudBoard;
import simcan2.Architecture.Nodes.Cloud.CloudRack;
import simcan2.Management.DataCenterManager.DataCenterManager;
import simcan2.Management.CloudProviders.*.*;
import simcan2.Architecture.Network.DataCenterNetwork.*;
import simcan2.Management.UserGenerators.UserGenerator.*;
import simcan2.Management.UserGenerators.UserGeneratorBase.*;

// ---------------------------------------------------------------
//   Definition of the data-center DataCenter
// ---------------------------------------------------------------
module DataCenter{

	parameters:
		string appList;
		string vmList;
		string userList;

	gates:
		input fromCloudProvider;
		output toCloudProvider;
	
	// -------------------------------------------------------
	//   Definition of main modules
	// -------------------------------------------------------
	submodules:

		// ---------------------------------------------------------------
		//   Definition of the data-center manager
		// ---------------------------------------------------------------
		dcManager:DataCenterManager{
			parameters:
				appList=appList;
				vmList=vmList;
				userList=userList;
		}

		// ---------------------------------------------------------------
		//   Definition of Computing Racks
		// ---------------------------------------------------------------
		computingRack_computingRack_1:CloudRack;
		

		// ---------------------------------------------------------------
		//   Definition of Storage Racks
		// ---------------------------------------------------------------
		storageRack_storageRack_1:CloudRack;
		

		// ---------------------------------------------------------------
		//   Definition of Network
		// ---------------------------------------------------------------
		dataCenterNetwork:DataCenterNetwork{
			gates:
				inComm[1];
				outComm[1];
				inStorage[1];
				outStorage[1];
		}

	// ---------------------------------------------------------------
	//   Connections section
	// ---------------------------------------------------------------
	connections allowunconnected:

		// Connections between Data-Center manager and Data-center outside
		dcManager.out --> ned.IdealChannel --> toCloudProvider;
		dcManager.in <-- ned.IdealChannel <-- fromCloudProvider;

		// Connections between computing racks and the network
		computingRack_computingRack_1.out --> {datarate=1.0Gbps;} --> dataCenterNetwork.inComm++;
		computingRack_computingRack_1.in <-- {datarate=1.0Gbps;} <-- dataCenterNetwork.outComm++;
		

		// Connections between storage racks and the network
		storageRack_storageRack_1.out --> {datarate=1.0Gbps;} --> dataCenterNetwork.inStorage++;
		storageRack_storageRack_1.in <-- {datarate=1.0Gbps;} <-- dataCenterNetwork.outStorage++;
		

}

// ---------------------------------------------------------------
//   Definition of the scenario
// ---------------------------------------------------------------
network cloudInfrastructure{

	parameters:
		string appList;
		string vmList;
		string userList;
		string dataCentersList;

	// -------------------------------------------------------
	//   Definition of main modules
	// -------------------------------------------------------
	submodules:

		// ---------------------------------------------------------------
		//   Definition of the data-centers
		// ---------------------------------------------------------------
		dc_DataCenter_1:DataCenter{
			parameters:
				appList=appList;
				vmList=vmList;
				userList=userList;
		}
		

		// -------------------------------------------------------
		//   Definition of the cloud provider
		// -------------------------------------------------------
		cloudProvider:CloudProviderFirstFit{
			parameters:
				appList=appList;
				vmList=vmList;
				userList=userList;
				dataCentersList=dataCentersList;
				@display("p=245,221;i=provider");
		
			gates:
				fromDataCenter[1];
				toDataCenter[1];
		}

		// -------------------------------------------------------
		//   Definition of the user generator
		// -------------------------------------------------------
		userGenerator:UserGenerator{
			parameters:
				appList=appList;
				vmList=vmList;
				userList=userList;
				@display("p=245,368;i=users");
		}
	
	// ---------------------------------------------------------------
	//   Connections section
	// ---------------------------------------------------------------
	connections allowunconnected:
	
		// Connections between the cloud provider and each data-center manager
			cloudProvider.toDataCenter++ --> {datarate=1.0Gbps;} --> dc_DataCenter_1.fromCloudProvider;
			cloudProvider.fromDataCenter++ <-- {datarate=1.0Gbps;} <-- dc_DataCenter_1.toCloudProvider;	
	
		cloudProvider.toUserGenerator --> ned.IdealChannel --> userGenerator.fromCloudProvider;
		userGenerator.toCloudProvider --> ned.IdealChannel --> cloudProvider.fromUserGenerator;
}
