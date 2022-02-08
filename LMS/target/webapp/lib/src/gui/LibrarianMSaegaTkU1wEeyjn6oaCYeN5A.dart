import 'dart:async';
import 'dart:convert';
import 'dart:html' as html;

import 'package:angular_router/angular_router.dart';
import 'package:angular/angular.dart';
import 'package:angular/security.dart';
import 'package:angular_forms/angular_forms.dart';

import 'package:app/src/app.dart';

import 'package:app/src/core/dime_process_service.dart';
//Notifications
import 'package:app/src/notification/notification_component.dart';
//Login
import 'package:app/src/login/Login.dart' as login;
import 'package:app/src/core/DIMEComponent.dart' as dime;

//Data
import 'package:app/src/data/Data.dart' as Data;
import 'package:app/src/models/FileReference.dart';
import 'package:app/src/filesupport/fileuploader.dart';
import 'package:app/src/filesupport/fileselect.dart';
import 'package:app/src/models/Selectives.dart';
import 'package:app/src/models/Todos.dart';
//Directives
import 'package:app/src/directives/MaxLength.dart';
import 'package:app/src/directives/DimeCustomeAttributes.dart';

//Import Services
import 'package:intl/intl.dart';
import 'package:intl/date_symbol_data_local.dart';
import 'package:markdown/markdown.dart' as markdown;
import 'package:app/src/modal/Modal.dart' as modal;
//Panel
import 'package:app/src/panel/Panel.dart' as panel;

//file guard imports
//special element imports
//table component imports
//form component imports
import 'package:app/src/forms/LibrarianMS/Form_oV7SkU6hEeyh2IUlWbuNpALibrarianMS.dart' as aoV7SkU6hEeyh2IUlWbuNpA;
//GUI plug in component imports
//GUI SIB imports
//Embedded process SIB imports

import 'dart:js' as js;
import 'package:app/src/core/AbstractRoutes.dart';

@Component(
  selector: "librarianms-tag",
  pipes: const [commonPipes,SecondsPipe],
  encapsulation: ViewEncapsulation.None,
  exports: const [
  	Data.DataCastUtil
  ],
  directives: const [
  coreDirectives,panel.Panel,modal.Modal,DimeCustomeAttributes,formDirectives,FileSelect,routerDirectives,MaxLength,login.Login,SafeInnerHtmlDirective,
  aoV7SkU6hEeyh2IUlWbuNpA.Form_oV7SkU6hEeyh2IUlWbuNpALibrarianMS,
  ],
  templateUrl: 'LibrarianMSaegaTkU1wEeyjn6oaCYeN5A.html'
)

class LibrarianMSaegaTkU1wEeyjn6oaCYeN5A extends dime.DIMEComponent implements OnInit, OnDestroy, AfterViewInit {
  
  	// common declarations
  	bool refresh;
  	@Input()
  	bool ismajorpage = false;
  	@Input()
  	String currentbranch;
  	@Input()
  	bool modalDialog = false;
  	ChangeDetectorRef cdr;
  	@Input()
  	String runtimeId;
  	@Input()
  	String guiId;
  	final Router router;
  	final DIMEProcessService processService;
  	final DomSanitizationService domSanitizationService; 
  	// component Default Declaration
  	// table refresh flags
  	
  	
  	
  	
  	/// Form
  	@ViewChildren(aoV7SkU6hEeyh2IUlWbuNpA.Form_oV7SkU6hEeyh2IUlWbuNpALibrarianMS)
  	List<aoV7SkU6hEeyh2IUlWbuNpA.Form_oV7SkU6hEeyh2IUlWbuNpALibrarianMS> formComponentaoV7SkU6hEeyh2IUlWbuNpA;
  	
  	// branch Submit as info.scce.dime.gui.editor.graphiti.api.CButton@e634561b (id: _oV-88E6hEeyh2IUlWbuNpA) in info.scce.dime.gui.editor.graphiti.api.CGUI@3830cb58 (id: _egaTkU1wEeyjn6oaCYeN5A)
  	@Output('actionsubmitevent') Stream<Map<String,dynamic>> get evt_actionsubmitevent => actionsubmitevent.stream;
  	StreamController<Map<String,dynamic>> actionsubmitevent = new StreamController();
  	
  	@ViewChildren(modal.Modal)
  	List<modal.Modal> modals;
  	bool hasToSignIn;
	//DATA CONTEXT
	//Librarian librarian
		@Input()
		Data.Librarian librarian;
	
	bool isDestroyed = true;
  
	LibrarianMSaegaTkU1wEeyjn6oaCYeN5A(DIMEProcessService this.processService, Router this.router,DomSanitizationService this.domSanitizationService,AbstractRoutes routes) : super(domSanitizationService,processService,routes)
	{
		restartComponent();
	}
	
	void restartComponent() {
		
		this.hasToSignIn = false;
		
		//DATA CONTEXT
		// Librarian librarian
		this.librarian = null;
						
						
		
			  	
		// branch Submit declaration
		if(this.actionsubmitevent!=null) {
			  			this.actionsubmitevent = new StreamController<Map<String,dynamic>>();  				
		}
			
		/// Form
		if(formComponentaoV7SkU6hEeyh2IUlWbuNpA!=null) {
			formComponentaoV7SkU6hEeyh2IUlWbuNpA.forEach((n) => n.restartComponent());
		}
		updateImageHash();
	}
	
	void updateWithoutInputs({bool updateHidden:true}) {
		modals.forEach((m)=>m.close());
		if(updateHidden) {
			formComponentaoV7SkU6hEeyh2IUlWbuNpA.forEach((n)=>n.updateWithoutInputs());
		}
		updateImageHash();
	}
	
	void updateInputs(
	{Data.Librarian plibrarian
	})
	{
		librarian = plibrarian;
		
		updateWithoutInputs(updateHidden:false);
		formComponentaoV7SkU6hEeyh2IUlWbuNpA.forEach((n)=>n.updateInputs(
			plibrarian:librarian
		));
	}
	
	
	@override
	void ngOnInit() async
	{
		initializeDateFormatting(html.window.navigator.language,null).then((_)=>Intl.defaultLocale = html.window.navigator.language);
		
		
		this.isDestroyed = false;
		openWebsockets();
	}
	
	void openWebsockets() {
	}
	
	
	@override
	void ngOnDestroy()
	{
	}
	
	
	void ngAfterViewInit() {
		html.window.document.dispatchEvent(new html.CustomEvent('dime-component-ready'));
		js.context.callMethod("enableTooltip",[]);
	}
	
  		@override
  		String getRuntimeId() => this.runtimeId;
  		
  		
  		
  		
  	
  		/// callback, if the button Submit is clicked
  		void actionsubmiteventaoV_45_88E6hEeyh2IUlWbuNpAEventTrigger(Map<String,dynamic> data)
  		{
  			this.actionsubmitevent.add(data);
  		}
  		
  		
  		
  		
  	
  		void formEventactionsubmiteventTrigger(Map<String,dynamic> data)
  		{
  			this.actionsubmitevent.add(data);
  		}
  		
  		
  		
  		Data.Librarian
  		 initOnDemandlibrarian()
  		{
  			if(this.librarian==null){
  				this.librarian = new Data.Librarian
  				();
  			}
  			return this.librarian;
  		}
  		void setValuelibrarian(Data.Librarian
  		 value)
  		{
  			this.librarian = value;
  		}
  		void librariansetValue(Data.Librarian
  		 value)
  		{
  			this.setValuelibrarian(value);
  		}
  		
  	
  		
  		
  		
  
	/// returns the surrounding container class for major GUI models
	String getContainer_egaTkU1wEeyjn6oaCYeN5ARootClass()
	{
		if(this.ismajorpage)return "";
		return "";
	}
	
	/// returns the surrounding wrapper class for major GUI models
	String getContainer_egaTkU1wEeyjn6oaCYeN5AId()
	{
		if(this.ismajorpage)return "wrapper";
		return "_egaTkU1wEeyjn6oaCYeN5A";
	}
	
	/// returns the surrounding container class for major GUI models
	String getContainer_egaTkU1wEeyjn6oaCYeN5AClass()
	{
		if(this.ismajorpage)return "container-display";
		return "";
	}
	
	/// callback, to go back to the root interaction
	void redirect_egaTkU1wEeyjn6oaCYeN5AToHome(dynamic e)
	{
		e.preventDefault();
		this.router.navigate(Routes.root.toUrl());
	}
}
