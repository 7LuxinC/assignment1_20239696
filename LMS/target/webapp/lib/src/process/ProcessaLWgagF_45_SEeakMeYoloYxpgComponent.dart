// root Home process combines all front end sibs reachable
import 'package:angular/angular.dart';	
import 'package:angular_router/angular_router.dart';
import 'dart:async';
import 'package:app/src/core/dime_process_service.dart';
import 'package:app/src/core/AbstractRoutes.dart';
import 'package:app/src/login/Login.dart' as login;
import 'package:app/src/notification/notification_component.dart';
//routes
import 'package:app/src/app.dart' as main;
//Data
import 'package:app/src/models/FileReference.dart';
import 'package:app/src/models/Selectives.dart';
import 'package:app/src/data/Data.dart' as Data;
//GUI model outputs
import 'package:app/src/rest/gui/PublicHome_LmrS0Ej8EeaK4_MRcoLfnwInput.dart';
import 'package:app/src/rest/gui/PublicHome_LmrS0Ej8EeaK4_MRcoLfnwBranch.dart';
import 'package:app/src/gui/PublicHomeaLmrS0Ej8EeaK4_MRcoLfnw.dart';
import 'package:app/src/rest/gui/PrivateHome_NGHA8F4TEear0NzybbrMtwInput.dart';
import 'package:app/src/rest/gui/PrivateHome_NGHA8F4TEear0NzybbrMtwBranch.dart';
import 'package:app/src/gui/PrivateHomeaNGHA8F4TEear0NzybbrMtw.dart';
import 'package:app/src/rest/gui/LibrarianMS_egaTkU1wEeyjn6oaCYeN5AInput.dart';
import 'package:app/src/rest/gui/LibrarianMS_egaTkU1wEeyjn6oaCYeN5ABranch.dart';
import 'package:app/src/gui/LibrarianMSaegaTkU1wEeyjn6oaCYeN5A.dart';
//NF model outputs

@Component(
  	selector: 'Home-aLWgagF_45_SEeakMeYoloYxpg-process',
  	directives: const [
  		coreDirectives,login.Login,PublicHomeaLmrS0Ej8EeaK4_MRcoLfnw,PrivateHomeaNGHA8F4TEear0NzybbrMtw,LibrarianMSaegaTkU1wEeyjn6oaCYeN5A,PublicHomeaLmrS0Ej8EeaK4_MRcoLfnw,PrivateHomeaNGHA8F4TEear0NzybbrMtw,LibrarianMSaegaTkU1wEeyjn6oaCYeN5A
  	],
	template: '''
	<login-form 
		*ngIf="showLogin"
		(signedin)="retry()"
		[modal]="false"
	></login-form>
	<template [ngIf]="!showLogin">
		<!-- Process Home -->
		<publichome-tag
			*ngIf="isVisible(majorSIB,'_-xUtUGUQEea0lrrxwspd7g')"
			[guiId]="'_LmrS0Ej8EeaK4_MRcoLfnw'"
			[runtimeId]="runtimeId"
			[currentbranch]="currentBranch"
			[modalDialog]="false"
			[ismajorpage]="true"
			(actionloginevent) = "eventa_45_xgTgGUQEea0lrrxwspd7gLoginTrigger(\$event)"
		>
		</publichome-tag>
		<privatehome-tag
			*ngIf="isVisible(majorSIB,'_3huTEGUQEea0lrrxwspd7g')"
			[guiId]="'_NGHA8F4TEear0NzybbrMtw'"
			[runtimeId]="runtimeId"
			[currentbranch]="currentBranch"
			[modalDialog]="false"
			[ismajorpage]="true"
			(actionlibrarianmsevent) = "eventaKtFBEU1yEeyjn6oaCYeN5ALibrarianMSTrigger(\$event)"
		>
		</privatehome-tag>
		<librarianms-tag
			*ngIf="isVisible(majorSIB,'_OpiM4U6hEeyh2IUlWbuNpA')"
			[guiId]="'_egaTkU1wEeyjn6oaCYeN5A'"
			[runtimeId]="runtimeId"
			[currentbranch]="currentBranch"
			[modalDialog]="false"
			[ismajorpage]="true"
			(actionsubmitevent) = "eventaOqB8IU6hEeyh2IUlWbuNpASubmitTrigger(\$event)"
		>
		</librarianms-tag>
		<!-- Process LibrarianMS -->
		<publichome-tag
			*ngIf="isVisible(majorSIB,'_LMIxEU1xEeyjn6oaCYeN5A')"
			[guiId]="'_LmrS0Ej8EeaK4_MRcoLfnw'"
			[runtimeId]="runtimeId"
			[currentbranch]="currentBranch"
			[modalDialog]="false"
			[ismajorpage]="true"
			(actionloginevent) = "eventaLOI8MU1xEeyjn6oaCYeN5ALoginTrigger(\$event)"
		>
		</publichome-tag>
		<privatehome-tag
			*ngIf="isVisible(majorSIB,'_-BVuQE1xEeyjn6oaCYeN5A')"
			[guiId]="'_NGHA8F4TEear0NzybbrMtw'"
			[runtimeId]="runtimeId"
			[currentbranch]="currentBranch"
			[modalDialog]="false"
			[ismajorpage]="true"
			(actionlibrarianmsevent) = "eventa_45_BpQQU1xEeyjn6oaCYeN5ALibrarianMSTrigger(\$event)"
		>
		</privatehome-tag>
	</template>
	'''
)
class ProcessaLWgagF_45_SEeakMeYoloYxpgComponent extends GUIProcess implements OnInit, OnChanges, AfterViewChecked {
	
	@Input()
	String runtimeId;
	
	@Input()
	String parentRuntimeId;
	
	@Input()
	String majorSIB;
	
	@Input()
	String minorSIB;
	
	@Input()
	String guiId;
	
	@Input()
	String sibId;
	
	@Input()
	UserInteractionResponse majorInput;
	
	@Input()
	UserInteractionResponse minorInput;
	
	@Input()
	UserInteractionResponseDeserializer deserializer;
	
	@override
	UserInteractionResponseDeserializer getDeserializer() => deserializer;
	
	PublicHome_LmrS0Ej8EeaK4_MRcoLfnwInput majora_45_xUtUGUQEea0lrrxwspd7gInput;
	PublicHome_LmrS0Ej8EeaK4_MRcoLfnwInput minora_45_xUtUGUQEea0lrrxwspd7gInput;
	PrivateHome_NGHA8F4TEear0NzybbrMtwInput majora3huTEGUQEea0lrrxwspd7gInput;
	PrivateHome_NGHA8F4TEear0NzybbrMtwInput minora3huTEGUQEea0lrrxwspd7gInput;
	LibrarianMS_egaTkU1wEeyjn6oaCYeN5AInput majoraOpiM4U6hEeyh2IUlWbuNpAInput;
	LibrarianMS_egaTkU1wEeyjn6oaCYeN5AInput minoraOpiM4U6hEeyh2IUlWbuNpAInput;
	PublicHome_LmrS0Ej8EeaK4_MRcoLfnwInput majoraLMIxEU1xEeyjn6oaCYeN5AInput;
	PublicHome_LmrS0Ej8EeaK4_MRcoLfnwInput minoraLMIxEU1xEeyjn6oaCYeN5AInput;
	PrivateHome_NGHA8F4TEear0NzybbrMtwInput majora_45_BVuQE1xEeyjn6oaCYeN5AInput;
	PrivateHome_NGHA8F4TEear0NzybbrMtwInput minora_45_BVuQE1xEeyjn6oaCYeN5AInput;
	
	final DIMEProcessService _processService;
	
	final Router _router;
	
	final NotificationService _notificationService;
	
	
	// GUISIBs of Process Home
	// GUISIB PublicHome
	@ViewChildren(PublicHomeaLmrS0Ej8EeaK4_MRcoLfnw)
	List<PublicHomeaLmrS0Ej8EeaK4_MRcoLfnw> componenta_45_xUtUGUQEea0lrrxwspd7g;
	// GUISIBs of Process Home
	// GUISIB PrivateHome
	@ViewChildren(PrivateHomeaNGHA8F4TEear0NzybbrMtw)
	List<PrivateHomeaNGHA8F4TEear0NzybbrMtw> componenta3huTEGUQEea0lrrxwspd7g;
	// GUISIBs of Process Home
	// GUISIB LibrarianMS
	@ViewChildren(LibrarianMSaegaTkU1wEeyjn6oaCYeN5A)
	List<LibrarianMSaegaTkU1wEeyjn6oaCYeN5A> componentaOpiM4U6hEeyh2IUlWbuNpA;
	// GUISIBs of Process LibrarianMS
	// GUISIB PublicHome
	@ViewChildren(PublicHomeaLmrS0Ej8EeaK4_MRcoLfnw)
	List<PublicHomeaLmrS0Ej8EeaK4_MRcoLfnw> componentaLMIxEU1xEeyjn6oaCYeN5A;
	// GUISIBs of Process LibrarianMS
	// GUISIB PrivateHome
	@ViewChildren(PrivateHomeaNGHA8F4TEear0NzybbrMtw)
	List<PrivateHomeaNGHA8F4TEear0NzybbrMtw> componenta_45_BVuQE1xEeyjn6oaCYeN5A;
	
	ProcessaLWgagF_45_SEeakMeYoloYxpgComponent(this._processService,this._router,this._notificationService,AbstractRoutes routes): super(routes);

	@override
	ngOnInit() {
		reActivateProcess();
		started = true;
	}
	
	@override
	ngAfterViewChecked() {
	}
	
	void retry() {
		retryAfterLogin(_processService,"Home_LWgagF__HYPHEN_MINUS__SEeakMeYoloYxpg",sibId:sibId);
	}
	
	@override
	void ngOnChanges(Map<String, SimpleChange> changes) {
		reActivateProcess();
	}
	
	@override
	Map<String,ActiveProcess> getActiveProcesses() => _processService.activeProcesses;
	
	@override
	String getParentRuntimeId() => parentRuntimeId;
	
	@override
	String getRuntimeId() => runtimeId;
	
	@override
    String getGUIId() => guiId;
    
    @override
    Router getRouter() => _router;
    
    @override
    NotificationService getNotificationService() => _notificationService;
	
	/// starts a front end routine or a GUI by event
	void reActivateProcess() {
		
		if(isVisible(majorSIB,'_-xUtUGUQEea0lrrxwspd7g')) {
			majora_45_xUtUGUQEea0lrrxwspd7gInput = majorInput as PublicHome_LmrS0Ej8EeaK4_MRcoLfnwInput;
			if(componenta_45_xUtUGUQEea0lrrxwspd7g != null) {
				componenta_45_xUtUGUQEea0lrrxwspd7g.forEach((n)=>n.updateInputs(
				));
			}
		} else if(isVisible(minorSIB,'_-xUtUGUQEea0lrrxwspd7g')) {
			PublicHome_LmrS0Ej8EeaK4_MRcoLfnwInput newInput = minorInput as PublicHome_LmrS0Ej8EeaK4_MRcoLfnwInput;
			bool hasChanged = minora_45_xUtUGUQEea0lrrxwspd7gInput!=null?minora_45_xUtUGUQEea0lrrxwspd7gInput.inpusChanged(newInput):true;
			minora_45_xUtUGUQEea0lrrxwspd7gInput = newInput;
			if(componenta_45_xUtUGUQEea0lrrxwspd7g != null) {
				componenta_45_xUtUGUQEea0lrrxwspd7g.forEach((n)=>n.updateInputs(
				));
				if(hasChanged) {
					componenta_45_xUtUGUQEea0lrrxwspd7g.forEach((n)=>n.restartComponent());			
				}
			}
		}
		if(isVisible(majorSIB,'_3huTEGUQEea0lrrxwspd7g')) {
			majora3huTEGUQEea0lrrxwspd7gInput = majorInput as PrivateHome_NGHA8F4TEear0NzybbrMtwInput;
			if(componenta3huTEGUQEea0lrrxwspd7g != null) {
				componenta3huTEGUQEea0lrrxwspd7g.forEach((n)=>n.updateInputs(
				));
			}
		} else if(isVisible(minorSIB,'_3huTEGUQEea0lrrxwspd7g')) {
			PrivateHome_NGHA8F4TEear0NzybbrMtwInput newInput = minorInput as PrivateHome_NGHA8F4TEear0NzybbrMtwInput;
			bool hasChanged = minora3huTEGUQEea0lrrxwspd7gInput!=null?minora3huTEGUQEea0lrrxwspd7gInput.inpusChanged(newInput):true;
			minora3huTEGUQEea0lrrxwspd7gInput = newInput;
			if(componenta3huTEGUQEea0lrrxwspd7g != null) {
				componenta3huTEGUQEea0lrrxwspd7g.forEach((n)=>n.updateInputs(
				));
				if(hasChanged) {
					componenta3huTEGUQEea0lrrxwspd7g.forEach((n)=>n.restartComponent());			
				}
			}
		}
		if(isVisible(majorSIB,'_OpiM4U6hEeyh2IUlWbuNpA')) {
			majoraOpiM4U6hEeyh2IUlWbuNpAInput = majorInput as LibrarianMS_egaTkU1wEeyjn6oaCYeN5AInput;
			if(componentaOpiM4U6hEeyh2IUlWbuNpA != null) {
				componentaOpiM4U6hEeyh2IUlWbuNpA.forEach((n)=>n.updateInputs(
					plibrarian:majoraOpiM4U6hEeyh2IUlWbuNpAInput.librarian
				));
			}
		} else if(isVisible(minorSIB,'_OpiM4U6hEeyh2IUlWbuNpA')) {
			LibrarianMS_egaTkU1wEeyjn6oaCYeN5AInput newInput = minorInput as LibrarianMS_egaTkU1wEeyjn6oaCYeN5AInput;
			bool hasChanged = minoraOpiM4U6hEeyh2IUlWbuNpAInput!=null?minoraOpiM4U6hEeyh2IUlWbuNpAInput.inpusChanged(newInput):true;
			minoraOpiM4U6hEeyh2IUlWbuNpAInput = newInput;
			if(componentaOpiM4U6hEeyh2IUlWbuNpA != null) {
				componentaOpiM4U6hEeyh2IUlWbuNpA.forEach((n)=>n.updateInputs(
					plibrarian:minoraOpiM4U6hEeyh2IUlWbuNpAInput.librarian
				));
				if(hasChanged) {
					componentaOpiM4U6hEeyh2IUlWbuNpA.forEach((n)=>n.restartComponent());			
				}
			}
		}
		if(isVisible(majorSIB,'_LMIxEU1xEeyjn6oaCYeN5A')) {
			majoraLMIxEU1xEeyjn6oaCYeN5AInput = majorInput as PublicHome_LmrS0Ej8EeaK4_MRcoLfnwInput;
			if(componentaLMIxEU1xEeyjn6oaCYeN5A != null) {
				componentaLMIxEU1xEeyjn6oaCYeN5A.forEach((n)=>n.updateInputs(
				));
			}
		} else if(isVisible(minorSIB,'_LMIxEU1xEeyjn6oaCYeN5A')) {
			PublicHome_LmrS0Ej8EeaK4_MRcoLfnwInput newInput = minorInput as PublicHome_LmrS0Ej8EeaK4_MRcoLfnwInput;
			bool hasChanged = minoraLMIxEU1xEeyjn6oaCYeN5AInput!=null?minoraLMIxEU1xEeyjn6oaCYeN5AInput.inpusChanged(newInput):true;
			minoraLMIxEU1xEeyjn6oaCYeN5AInput = newInput;
			if(componentaLMIxEU1xEeyjn6oaCYeN5A != null) {
				componentaLMIxEU1xEeyjn6oaCYeN5A.forEach((n)=>n.updateInputs(
				));
				if(hasChanged) {
					componentaLMIxEU1xEeyjn6oaCYeN5A.forEach((n)=>n.restartComponent());			
				}
			}
		}
		if(isVisible(majorSIB,'_-BVuQE1xEeyjn6oaCYeN5A')) {
			majora_45_BVuQE1xEeyjn6oaCYeN5AInput = majorInput as PrivateHome_NGHA8F4TEear0NzybbrMtwInput;
			if(componenta_45_BVuQE1xEeyjn6oaCYeN5A != null) {
				componenta_45_BVuQE1xEeyjn6oaCYeN5A.forEach((n)=>n.updateInputs(
				));
			}
		} else if(isVisible(minorSIB,'_-BVuQE1xEeyjn6oaCYeN5A')) {
			PrivateHome_NGHA8F4TEear0NzybbrMtwInput newInput = minorInput as PrivateHome_NGHA8F4TEear0NzybbrMtwInput;
			bool hasChanged = minora_45_BVuQE1xEeyjn6oaCYeN5AInput!=null?minora_45_BVuQE1xEeyjn6oaCYeN5AInput.inpusChanged(newInput):true;
			minora_45_BVuQE1xEeyjn6oaCYeN5AInput = newInput;
			if(componenta_45_BVuQE1xEeyjn6oaCYeN5A != null) {
				componenta_45_BVuQE1xEeyjn6oaCYeN5A.forEach((n)=>n.updateInputs(
				));
				if(hasChanged) {
					componenta_45_BVuQE1xEeyjn6oaCYeN5A.forEach((n)=>n.restartComponent());			
				}
			}
		}
		
		
	}
	// Branches for GUISIB PublicHome of Process Home
	// Branch Login
	void eventa_45_xgTgGUQEea0lrrxwspd7gLoginTrigger(Map<String,dynamic> map)
	{
		var result = new PublicHome_LmrS0Ej8EeaK4_MRcoLfnwBranch.forLoginBranch(
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_LmrS0Ej8EeaK4_MRcoLfnw',
			'Login/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
	// Branches for GUISIB PrivateHome of Process Home
	// Branch LibrarianMS
	void eventaKtFBEU1yEeyjn6oaCYeN5ALibrarianMSTrigger(Map<String,dynamic> map)
	{
		var result = new PrivateHome_NGHA8F4TEear0NzybbrMtwBranch.forLibrarianMSBranch(
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_NGHA8F4TEear0NzybbrMtw',
			'LibrarianMS/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
	// Branches for GUISIB LibrarianMS of Process Home
	// Branch Submit
	void eventaOqB8IU6hEeyh2IUlWbuNpASubmitTrigger(Map<String,dynamic> map)
	{
		var result = new LibrarianMS_egaTkU1wEeyjn6oaCYeN5ABranch.forSubmitBranch(
			librarian:map['librarian'] as Data.Librarian
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_egaTkU1wEeyjn6oaCYeN5A',
			'Submit/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
	// Branches for GUISIB PublicHome of Process LibrarianMS
	// Branch Login
	void eventaLOI8MU1xEeyjn6oaCYeN5ALoginTrigger(Map<String,dynamic> map)
	{
		var result = new PublicHome_LmrS0Ej8EeaK4_MRcoLfnwBranch.forLoginBranch(
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_LmrS0Ej8EeaK4_MRcoLfnw',
			'Login/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
	// Branches for GUISIB PrivateHome of Process LibrarianMS
	// Branch LibrarianMS
	void eventa_45_BpQQU1xEeyjn6oaCYeN5ALibrarianMSTrigger(Map<String,dynamic> map)
	{
		var result = new PrivateHome_NGHA8F4TEear0NzybbrMtwBranch.forLibrarianMSBranch(
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_NGHA8F4TEear0NzybbrMtw',
			'LibrarianMS/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
}
