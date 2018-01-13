/**
 */
package es.uclm.uml2cloud.profile.uml2cloudprofile.impl;

import es.uclm.uml2cloud.profile.uml2cloudprofile.Channel;
import es.uclm.uml2cloud.profile.uml2cloudprofile.Rack;
import es.uclm.uml2cloud.profile.uml2cloudprofile.UML2CloudProfilePackage;

import es.uclm.uml2cloud.profile.uml2cloudprofile.util.UML2CloudProfileValidator;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.uml2.uml.Component;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rack</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.RackImpl#getBase_Component <em>Base Component</em>}</li>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.RackImpl#getNodesPerBoard <em>Nodes Per Board</em>}</li>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.RackImpl#getCommLink <em>Comm Link</em>}</li>
 *   <li>{@link es.uclm.uml2cloud.profile.uml2cloudprofile.impl.RackImpl#getBoards <em>Boards</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class RackImpl extends MinimalEObjectImpl.Container implements Rack {
	/**
	 * The cached value of the '{@link #getBase_Component() <em>Base Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Component()
	 * @generated
	 * @ordered
	 */
	protected Component base_Component;

	/**
	 * The default value of the '{@link #getNodesPerBoard() <em>Nodes Per Board</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodesPerBoard()
	 * @generated
	 * @ordered
	 */
	protected static final int NODES_PER_BOARD_EDEFAULT = 8;

	/**
	 * The cached value of the '{@link #getNodesPerBoard() <em>Nodes Per Board</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodesPerBoard()
	 * @generated
	 * @ordered
	 */
	protected int nodesPerBoard = NODES_PER_BOARD_EDEFAULT;

	/**
	 * The default value of the '{@link #getCommLink() <em>Comm Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommLink()
	 * @generated
	 * @ordered
	 */
	protected static final Channel COMM_LINK_EDEFAULT = Channel.ETHERNET40_GBPS;

	/**
	 * The cached value of the '{@link #getCommLink() <em>Comm Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommLink()
	 * @generated
	 * @ordered
	 */
	protected Channel commLink = COMM_LINK_EDEFAULT;

	/**
	 * The default value of the '{@link #getBoards() <em>Boards</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoards()
	 * @generated
	 * @ordered
	 */
	protected static final int BOARDS_EDEFAULT = 8;

	/**
	 * The cached value of the '{@link #getBoards() <em>Boards</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoards()
	 * @generated
	 * @ordered
	 */
	protected int boards = BOARDS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RackImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UML2CloudProfilePackage.Literals.RACK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component getBase_Component() {
		if (base_Component != null && base_Component.eIsProxy()) {
			InternalEObject oldBase_Component = (InternalEObject)base_Component;
			base_Component = (Component)eResolveProxy(oldBase_Component);
			if (base_Component != oldBase_Component) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UML2CloudProfilePackage.RACK__BASE_COMPONENT, oldBase_Component, base_Component));
			}
		}
		return base_Component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component basicGetBase_Component() {
		return base_Component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Component(Component newBase_Component) {
		Component oldBase_Component = base_Component;
		base_Component = newBase_Component;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2CloudProfilePackage.RACK__BASE_COMPONENT, oldBase_Component, base_Component));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNodesPerBoard() {
		return nodesPerBoard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodesPerBoard(int newNodesPerBoard) {
		int oldNodesPerBoard = nodesPerBoard;
		nodesPerBoard = newNodesPerBoard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2CloudProfilePackage.RACK__NODES_PER_BOARD, oldNodesPerBoard, nodesPerBoard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Channel getCommLink() {
		return commLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommLink(Channel newCommLink) {
		Channel oldCommLink = commLink;
		commLink = newCommLink == null ? COMM_LINK_EDEFAULT : newCommLink;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2CloudProfilePackage.RACK__COMM_LINK, oldCommLink, commLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBoards() {
		return boards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoards(int newBoards) {
		int oldBoards = boards;
		boards = newBoards;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UML2CloudProfilePackage.RACK__BOARDS, oldBoards, boards));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean boards_Must_Be_Greatter_Than_Zero(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 UML2CloudProfileValidator.DIAGNOSTIC_SOURCE,
						 UML2CloudProfileValidator.RACK__BOARDS_MUST_BE_GREATTER_THAN_ZERO,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "boards_Must_Be_Greatter_Than_Zero", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean nodesPerBoard_Must_Be_Greatter_Than_Zero(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 UML2CloudProfileValidator.DIAGNOSTIC_SOURCE,
						 UML2CloudProfileValidator.RACK__NODES_PER_BOARD_MUST_BE_GREATTER_THAN_ZERO,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "nodesPerBoard_Must_Be_Greatter_Than_Zero", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UML2CloudProfilePackage.RACK__BASE_COMPONENT:
				if (resolve) return getBase_Component();
				return basicGetBase_Component();
			case UML2CloudProfilePackage.RACK__NODES_PER_BOARD:
				return getNodesPerBoard();
			case UML2CloudProfilePackage.RACK__COMM_LINK:
				return getCommLink();
			case UML2CloudProfilePackage.RACK__BOARDS:
				return getBoards();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UML2CloudProfilePackage.RACK__BASE_COMPONENT:
				setBase_Component((Component)newValue);
				return;
			case UML2CloudProfilePackage.RACK__NODES_PER_BOARD:
				setNodesPerBoard((Integer)newValue);
				return;
			case UML2CloudProfilePackage.RACK__COMM_LINK:
				setCommLink((Channel)newValue);
				return;
			case UML2CloudProfilePackage.RACK__BOARDS:
				setBoards((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case UML2CloudProfilePackage.RACK__BASE_COMPONENT:
				setBase_Component((Component)null);
				return;
			case UML2CloudProfilePackage.RACK__NODES_PER_BOARD:
				setNodesPerBoard(NODES_PER_BOARD_EDEFAULT);
				return;
			case UML2CloudProfilePackage.RACK__COMM_LINK:
				setCommLink(COMM_LINK_EDEFAULT);
				return;
			case UML2CloudProfilePackage.RACK__BOARDS:
				setBoards(BOARDS_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UML2CloudProfilePackage.RACK__BASE_COMPONENT:
				return base_Component != null;
			case UML2CloudProfilePackage.RACK__NODES_PER_BOARD:
				return nodesPerBoard != NODES_PER_BOARD_EDEFAULT;
			case UML2CloudProfilePackage.RACK__COMM_LINK:
				return commLink != COMM_LINK_EDEFAULT;
			case UML2CloudProfilePackage.RACK__BOARDS:
				return boards != BOARDS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case UML2CloudProfilePackage.RACK___BOARDS_MUST_BE_GREATTER_THAN_ZERO__DIAGNOSTICCHAIN_MAP:
				return boards_Must_Be_Greatter_Than_Zero((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case UML2CloudProfilePackage.RACK___NODES_PER_BOARD_MUST_BE_GREATTER_THAN_ZERO__DIAGNOSTICCHAIN_MAP:
				return nodesPerBoard_Must_Be_Greatter_Than_Zero((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (nodesPerBoard: ");
		result.append(nodesPerBoard);
		result.append(", commLink: ");
		result.append(commLink);
		result.append(", boards: ");
		result.append(boards);
		result.append(')');
		return result.toString();
	}

} //RackImpl
