// generated by info.scce.dime.generator.gui.rest.DartTOGeneratorHelper#generateGUIOutputsDart

import 'dart:convert';
import 'package:app/src/models/Selectives.dart';
import 'package:app/src/data/Data.dart' as Data;
import 'package:app/src/models/FileReference.dart';
import 'package:app/src/core/dime_process_service.dart';

class PublicHome_LmrS0Ej8EeaK4_MRcoLfnwBranch extends ContinueProcessRequest {
	
	
	Login branch_Login;
	
	PublicHome_LmrS0Ej8EeaK4_MRcoLfnwBranch.forLoginBranch(
	) {
		branch_Login = new Login();
	}

	String toJSON() {
		return jsonEncode(toJSOG());
	}
		
	Map<String,dynamic> toJSOG()
	{
		Map<String,dynamic> jsonObj = new Map();
		
		if(branch_Login!=null) {
			return branch_Login.toJSOG();
		}
		throw new Exception("Exhaustive IF PublicHome_LmrS0Ej8EeaK4_MRcoLfnwBranch.dart");
	}
}
	
	class Login {
		

		Map<String,dynamic> toJSOG()
		{
			
			Map<String,dynamic> jsonObj = new Map();
					
			return jsonObj;
		}
		
	}