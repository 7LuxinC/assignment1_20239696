import 'dart:js' as js;
import 'package:app/src/core/AbstractRoutes.dart';
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
//GUI plug in component imports
//GUI SIB imports
//Embedded process SIB imports

import 'package:app/src/core/Validators.dart' as validators;

// Form placed in GUI model LibrarianMS
@Component(
  selector: 'form-_oV7SkU6hEeyh2IUlWbuNpA-librarianMS',
  viewProviders: const [FORM_BINDINGS],
  pipes: const [commonPipes,SecondsPipe],
  encapsulation: ViewEncapsulation.None,
  exports: const [
  	Data.DataCastUtil
  ],
  directives: const [
  coreDirectives,panel.Panel,modal.Modal,DimeCustomeAttributes,formDirectives,FileSelect,routerDirectives,MaxLength,login.Login,SafeInnerHtmlDirective,
  ],
  templateUrl: 'Form_oV7SkU6hEeyh2IUlWbuNpALibrarianMS.html'
)
class Form_oV7SkU6hEeyh2IUlWbuNpALibrarianMS extends dime.DIMEComponent implements OnInit, AfterViewChecked {
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
  	
  	
  	
  	
  	
  	// branch Submit as info.scce.dime.gui.editor.graphiti.api.CButton@e634561b (id: _oV-88E6hEeyh2IUlWbuNpA) in info.scce.dime.gui.editor.graphiti.api.CGUI@3830cb58 (id: _egaTkU1wEeyjn6oaCYeN5A)
  	@Output('actionsubmitevent') Stream<Map<String,dynamic>> get evt_actionsubmitevent => actionsubmitevent.stream;
  	StreamController<Map<String,dynamic>> actionsubmitevent = new StreamController();
  	
  	@ViewChildren(modal.Modal)
  	List<modal.Modal> modals;
  	
  	//Form load variable
  		@Input()
  		Data.Librarian
  		 formLoad;
  	//Global Scope
  	//DATA CONTEXT
  	//Librarian librarian
  		@Input()
  		Data.Librarian librarian;
  	//Extra input variables
	
	//FORM
	ControlGroup form_oV7SkU6hEeyh2IUlWbuNpAForm;
	bool formLoaded = false;
	//Form Inputs:
	// input field: lastname
	String input__qX38MU6hEeyh2IUlWbuNpA;
	// input field: firstname
	String input__qYRk0U6hEeyh2IUlWbuNpA;
	// input field: id
	int input__qYwF8U6hEeyh2IUlWbuNpA;
	// input field: section
	String input__qZP1MU6hEeyh2IUlWbuNpA;
	// input field: position
	String input__qZxZoU6hEeyh2IUlWbuNpA;

	
	@Output('complex_librarian_update') Stream<dynamic> get complex_librarian_update => _complex_librarian_update.stream;
	StreamController<dynamic> _complex_librarian_update = new StreamController();

  	Form_oV7SkU6hEeyh2IUlWbuNpALibrarianMS(DIMEProcessService this.processService,Router this.router,DomSanitizationService this.domSanitizationService,AbstractRoutes routes) : super(domSanitizationService,processService,routes)
	{
		restartComponent();
	}
	
	void restartComponent() {
		
		
			  	
		// branch Submit declaration
		if(this.actionsubmitevent!=null) {
			  			this.actionsubmitevent = new StreamController<Map<String,dynamic>>();  				
		}
			
	}
	
	
	void updateWithoutInputs({bool updateHidden:true}) {
		modals.forEach((m)=>m.close());
		if(updateHidden) {
		}
		updateImageHash();
	}
	
	void updateInputs(
	{Data.Librarian plibrarian
	})
	{
		librarian = plibrarian;
		
		updateWithoutInputs(updateHidden:false);
		loadFormFieldValues();
		
	}
	
	void loadFormFieldValues() {
		
	}
	
	void ngAfterViewChecked() {
		if(html.querySelector("#form${this.form_oV7SkU6hEeyh2IUlWbuNpAForm.hashCode}")!=null&&!formLoaded) {
			formLoaded = true;
		}
	}
	
	
	/// called after the input variables are loaded, but before the template rendering
	void ngOnInit()
	{
		initializeDateFormatting(html.window.navigator.language,null).then((_)=>Intl.defaultLocale = html.window.navigator.language);
		
		
		
		
		//FORM Field grouping and vaalidation
		this.form_oV7SkU6hEeyh2IUlWbuNpAForm = FormBuilder.controlGroup({
			"input__qX38MU6hEeyh2IUlWbuNpA": [
				""
				,
				Validators.compose([
					
				])
				],
			"input__qYRk0U6hEeyh2IUlWbuNpA": [
				""
				,
				Validators.compose([
					
				])
				],
			"input__qYwF8U6hEeyh2IUlWbuNpA": [
				""
				,
				Validators.compose([
					validators.DIMEValidators.typeNumberValidator
					
				])
				],
			"input__qZP1MU6hEeyh2IUlWbuNpA": [
				""
				,
				Validators.compose([
					
				])
				],
			"input__qZxZoU6hEeyh2IUlWbuNpA": [
				""
				,
				Validators.compose([
					
				])
				]
		});
		
		//FORM Field loading
		this.loadFormFieldValues();
	}
  
  		@override
  		String getRuntimeId() => this.runtimeId;
  		
  		
  		
  		
  	
  		/// callback, if the button Submit is clicked
  			void actionsubmiteventaoV_45_88E6hEeyh2IUlWbuNpAEventTrigger(dynamic formValues)
  		
  		{
  			//Submit Form Values
  			this.form_oV7SkU6hEeyh2IUlWbuNpAFormSubmit(formValues);
  			Map<String,dynamic> data = new Map();
  			data['librarian'] = this.librarian;
  			this.actionsubmitevent.add(data);
  		}
  		
  		
  		
  		
  	
  		
  		
  		
  		Data.Librarian
  		 initOnDemandlibrarian()
  		{
  			if(this.librarian==null){
  				this.librarian = new Data.Librarian
  				();
  				this._complex_librarian_update.add(this.librarian);
  			}
  			return this.librarian;
  		}
  		void setValuelibrarian(Data.Librarian
  		 value)
  		{
  			this.librarian = value;
  			this._complex_librarian_update.add(this.librarian);
  		}
  		void librariansetValue(Data.Librarian
  		 value)
  		{
  			this.setValuelibrarian(value);
  		}
  		
  	
  		
  		
  		
	// Triggered on Form Submit
	void form_oV7SkU6hEeyh2IUlWbuNpAFormSubmit(Map formValues) {
	// Store Form Data in Attributes
	// input field lastname with type: Text
	if(this.input__qX38MU6hEeyh2IUlWbuNpA!=null){
		if(this.input__qX38MU6hEeyh2IUlWbuNpA.toString().isNotEmpty){
			this.initOnDemandlibrarian().setValuelastname(
			input__qX38MU6hEeyh2IUlWbuNpA
			);
		} else {
			this.initOnDemandlibrarian().setValuelastname('');
		}
	} else {
		this.initOnDemandlibrarian().setValuelastname('');
	}
	// input field firstname with type: Text
	if(this.input__qYRk0U6hEeyh2IUlWbuNpA!=null){
		if(this.input__qYRk0U6hEeyh2IUlWbuNpA.toString().isNotEmpty){
			this.initOnDemandlibrarian().setValuefirstname(
			input__qYRk0U6hEeyh2IUlWbuNpA
			);
		} else {
			this.initOnDemandlibrarian().setValuefirstname('');
		}
	} else {
		this.initOnDemandlibrarian().setValuefirstname('');
	}
	// input field id with type: Number
	if(this.input__qYwF8U6hEeyh2IUlWbuNpA!=null){
		if(this.input__qYwF8U6hEeyh2IUlWbuNpA.toString().isNotEmpty){
			this.initOnDemandlibrarian().setValueid(
			input__qYwF8U6hEeyh2IUlWbuNpA
			);
		} else {
			this.initOnDemandlibrarian().setValueid(0);
		}
	} else {
		this.initOnDemandlibrarian().setValueid(0);
	}
	// input field section with type: Text
	if(this.input__qZP1MU6hEeyh2IUlWbuNpA!=null){
		if(this.input__qZP1MU6hEeyh2IUlWbuNpA.toString().isNotEmpty){
			this.initOnDemandlibrarian().setValuesection(
			input__qZP1MU6hEeyh2IUlWbuNpA
			);
		} else {
			this.initOnDemandlibrarian().setValuesection('');
		}
	} else {
		this.initOnDemandlibrarian().setValuesection('');
	}
	// input field position with type: Text
	if(this.input__qZxZoU6hEeyh2IUlWbuNpA!=null){
		if(this.input__qZxZoU6hEeyh2IUlWbuNpA.toString().isNotEmpty){
			this.initOnDemandlibrarian().setValueposition(
			input__qZxZoU6hEeyh2IUlWbuNpA
			);
		} else {
			this.initOnDemandlibrarian().setValueposition('');
		}
	} else {
		this.initOnDemandlibrarian().setValueposition('');
	}
	}
		
	static Map<String,dynamic> valueaqYwF8U6hEeyh2IUlWbuNpAValidator(AbstractControl control)
	{
		if(control.value != null) {
			if(control.value.toString().isNotEmpty) {
				RegExp regexp = new RegExp('^-*[0-9,\.]+');
				var test = regexp.hasMatch("${control.value.toString()}");
				if (!test){
					return {'valueaqYwF8U6hEeyh2IUlWbuNpAValidator': true};
				}
				if(!(num.parse(control.value.toString())>=0 && num.parse(control.value.toString())<=-1)){
					return {'valueaqYwF8U6hEeyh2IUlWbuNpAValidator': true};
				}
			}
		}
		return null;
	}
	
}
