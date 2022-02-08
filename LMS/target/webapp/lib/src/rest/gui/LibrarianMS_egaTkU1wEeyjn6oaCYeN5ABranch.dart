// generated by info.scce.dime.generator.gui.rest.DartTOGeneratorHelper#generateGUIOutputsDart

import 'dart:convert';
import 'package:app/src/models/Selectives.dart';
import 'package:app/src/data/Data.dart' as Data;
import 'package:app/src/models/FileReference.dart';
import 'package:app/src/core/dime_process_service.dart';

class LibrarianMS_egaTkU1wEeyjn6oaCYeN5ABranch extends ContinueProcessRequest {
	
	
	Submit branch_Submit;
	
	LibrarianMS_egaTkU1wEeyjn6oaCYeN5ABranch.forSubmitBranch(
{		Data.Librarian librarian:null
}	) {
		branch_Submit = new Submit();
		branch_Submit.port_librarian = librarian;
	}

	String toJSON() {
		return jsonEncode(toJSOG());
	}
		
	Map<String,dynamic> toJSOG()
	{
		Map<String,dynamic> jsonObj = new Map();
		
		if(branch_Submit!=null) {
			return branch_Submit.toJSOG();
		}
		throw new Exception("Exhaustive IF LibrarianMS_egaTkU1wEeyjn6oaCYeN5ABranch.dart");
	}
}
	
	class Submit {
		
		Data.Librarian port_librarian = null;

		Map<String,dynamic> toJSOG()
		{
			
			Map<String,dynamic> jsonObj = new Map();
Map<Object,dynamic> cache = new Map();			if(this.port_librarian != null){
				jsonObj["librarian"] = this.port_librarian.toJSOG(cache);
			}
			else{
				jsonObj["librarian"] = null;
			}
					
			return jsonObj;
		}
		
	}
