package simcan2.simulations.CloudInfrastructure;

import simcan2.Architecture.Nodes.Cloud.CloudBlade;
import simcan2.Architecture.Nodes.Cloud.CloudBoard;
import simcan2.Architecture.Nodes.Cloud.CloudRack;
import simcan2.Management.DataCenterManager.DataCenterManager;
import simcan2.Management.CloudProviders.*.*;
import simcan2.Architecture.Network.DataCenterNetwork.*;
import simcan2.Management.UserGenerators.UserGeneratorCost.*;

// ---------------------------------------------------------------
//   Definition of the data-center DataCenter
// ---------------------------------------------------------------
module DataCenter{

	parameters:
		string appList;
		string vmList;
		string slaList;
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
				slaList=slaList;
				userList=userList;
		}

		// ---------------------------------------------------------------
		//   Definition of Computing Racks
		// ---------------------------------------------------------------
		computingRack_ComputingRack_1:CloudRack;
		computingRack_ComputingRack_2:CloudRack;
		computingRack_ComputingRack_3:CloudRack;
		computingRack_ComputingRack_4:CloudRack;
		

		// ---------------------------------------------------------------
		//   Definition of Storage Racks
		// ---------------------------------------------------------------
		storageRack_StorageRack_1:CloudRack;
		

		// ---------------------------------------------------------------
		//   Definition of Network
		// ---------------------------------------------------------------
		dataCenterNetwork:DataCenterNetwork{
			gates:
				inComm[4];
				outComm[4];
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
		computingRack_ComputingRack_1.out --> {datarate=1.0Gbps;} --> dataCenterNetwork.inComm++;
		computingRack_ComputingRack_1.in <-- {datarate=1.0Gbps;} <-- dataCenterNetwork.outComm++;
		computingRack_ComputingRack_2.out --> {datarate=1.0Gbps;} --> dataCenterNetwork.inComm++;
		computingRack_ComputingRack_2.in <-- {datarate=1.0Gbps;} <-- dataCenterNetwork.outComm++;
		computingRack_ComputingRack_3.out --> {datarate=1.0Gbps;} --> dataCenterNetwork.inComm++;
		computingRack_ComputingRack_3.in <-- {datarate=1.0Gbps;} <-- dataCenterNetwork.outComm++;
		computingRack_ComputingRack_4.out --> {datarate=1.0Gbps;} --> dataCenterNetwork.inComm++;
		computingRack_ComputingRack_4.in <-- {datarate=1.0Gbps;} <-- dataCenterNetwork.outComm++;
		

		// Connections between storage racks and the network
		storageRack_StorageRack_1.out --> {datarate=1.0Gbps;} --> dataCenterNetwork.inStorage++;
		storageRack_StorageRack_1.in <-- {datarate=1.0Gbps;} <-- dataCenterNetwork.outStorage++;
		

}

// ---------------------------------------------------------------
//   Definition of the scenario
// ---------------------------------------------------------------
network CloudInfrastructure{

	parameters:
		string appList;
		string vmList;
		string slaList;
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
				slaList=slaList;
				userList=userList;
		}
		

		// -------------------------------------------------------
		//   Definition of the cloud provider
		// -------------------------------------------------------
		cloudProvider:CloudProvider_firstBestFit{
			parameters:
				appList=appList;
				vmList=vmList;
				slaList=slaList;
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
		userGenerator:UserGeneratorCost{
			parameters:
				appList=appList;
				vmList=vmList;
				slaList=slaList;
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

channel ComputingRackCustom_channel extends ned.DatarateChannel like IDataCenterChannel {datarate=1.0Gbps;}
channel StorageRackCustom_channel extends ned.DatarateChannel like IDataCenterChannel {datarate=1.0Gbps;}
