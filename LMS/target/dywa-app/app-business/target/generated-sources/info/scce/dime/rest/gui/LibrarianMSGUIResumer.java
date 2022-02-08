// generated by info.scce.dime.generator.rest.GUIProgressGenerator#generateGUIResumer
package info.scce.dime.rest.gui;

@javax.transaction.Transactional(dontRollbackOn = info.scce.dime.exception.GUIEncounteredSignal.class)
@javax.ws.rs.Path("/continue/_egaTkU1wEeyjn6oaCYeN5A")
public class LibrarianMSGUIResumer extends info.scce.dime.process.GUIResumer {
	
	@javax.inject.Inject
	private info.scce.dime.gui.ProcessResumer processResumer;
	
	// controller for fetching dywa file entities
	@javax.inject.Inject
	private de.ls5.dywa.generated.util.DomainFileController domainFileController;
	
	@javax.inject.Inject
	private de.ls5.dywa.generated.rest.controller.LibrarianREST LibrarianREST;
	@javax.inject.Inject
	private de.ls5.dywa.generated.controller.dime__HYPHEN_MINUS__models.app.LibrarianController LibrarianController;

	@javax.ws.rs.POST
	@javax.ws.rs.Path("Submit/branch/public")
	@javax.ws.rs.Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	@javax.ws.rs.Consumes(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public javax.ws.rs.core.Response continueSubmitBranch(info.scce.dime.rest.gui.model._oV__HYPHEN_MINUS__88E6hEeyh2IUlWbuNpABranch output) {
		
		checkAuthentication(output.getCallStack(),"_egaTkU1wEeyjn6oaCYeN5A/Submit");
		
			final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Librarian
			 librarian;
			if (output.getLibrarian() != null) {
			// create new object
			if (output.getLibrarian().getDywaId() == info.scce.dime.util.Constants.DYWA_ID_CREATE_NEW) {
				if(output.getLibrarian() instanceof de.ls5.dywa.generated.rest.types.Librarian) {
					final java.lang.String dywaName;
					if (output.getLibrarian().getDywaName() == null || output.getLibrarian().getDywaName().isEmpty()) {
						dywaName = "librarian";
					} else {
						dywaName = output.getLibrarian().getDywaName();
					}
					final long id;
					id = LibrarianREST.create(dywaName);
					output.getLibrarian().setDywaId(id);
					//update_LibrarianMSLibrarianSelectivex1_egaTkU1wEeyjn6oaCYeN5A
					LibrarianREST.update_LibrarianMSLibrarianSelectivex1_egaTkU1wEeyjn6oaCYeN5A((de.ls5.dywa.generated.rest.types.Librarian)output.getLibrarian());
					librarian = (de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Librarian
					) LibrarianController.read(output.getLibrarian().getDywaId());
				}
		 else { throw new java.lang.IllegalArgumentException("Unexpected type " + output.getLibrarian().getClass()); }	}
			// transient object
			else if (output.getLibrarian().getDywaId() == info.scce.dime.util.Constants.DYWA_ID_TRANSIENT) {
				if(output.getLibrarian() instanceof de.ls5.dywa.generated.rest.types.Librarian) {
					final java.lang.String dywaName;
					if (output.getLibrarian().getDywaName() == null || output.getLibrarian().getDywaName().isEmpty()) {
						dywaName = "librarian";
					} else {
						dywaName = output.getLibrarian().getDywaName();
					}
					final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Librarian transientObject;
					if (output.getLibrarian() instanceof de.ls5.dywa.generated.rest.types.Librarian) {
						transientObject = LibrarianController.createTransient(dywaName);
					}
					 else { throw new java.lang.IllegalArgumentException("Unexpected type " + output.getLibrarian().getClass()); }
		
					//update_LibrarianMSLibrarianSelectivex1_egaTkU1wEeyjn6oaCYeN5A
					LibrarianREST.update_LibrarianMSLibrarianSelectivex1_egaTkU1wEeyjn6oaCYeN5A((de.ls5.dywa.generated.rest.types.Librarian)output.getLibrarian(), transientObject);
					librarian = (de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Librarian
					) transientObject;
				}
		 else { throw new java.lang.IllegalArgumentException("Unexpected type " + output.getLibrarian().getClass()); }	}
			// regular object
				else {
					if(output.getLibrarian() instanceof de.ls5.dywa.generated.rest.types.Librarian) {
						//update_LibrarianMSLibrarianSelectivex1_egaTkU1wEeyjn6oaCYeN5A
						LibrarianREST.update_LibrarianMSLibrarianSelectivex1_egaTkU1wEeyjn6oaCYeN5A((de.ls5.dywa.generated.rest.types.Librarian)output.getLibrarian());
						librarian = (de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Librarian
						) LibrarianController.read(output.getLibrarian().getDywaId());
					}
		 else { throw new java.lang.IllegalArgumentException("Unexpected type " + output.getLibrarian().getClass()); }		}
			
			}
			else {
				librarian = null;
			}
		final info.scce.dime.gui.dime__HYPHEN_MINUS__models.gui.librarianms.LibrarianMS_egaTkU1wEeyjn6oaCYeN5AResult.gui__oV__HYPHEN_MINUS__88E6hEeyh2IUlWbuNpASubmitReturn guiReturn = new info.scce.dime.gui.dime__HYPHEN_MINUS__models.gui.librarianms.LibrarianMS_egaTkU1wEeyjn6oaCYeN5AResult.gui__oV__HYPHEN_MINUS__88E6hEeyh2IUlWbuNpASubmitReturn();
		guiReturn.setLibrarian(librarian);
		
		final info.scce.dime.gui.dime__HYPHEN_MINUS__models.gui.librarianms.LibrarianMS_egaTkU1wEeyjn6oaCYeN5AResult guiResult = 
		new info.scce.dime.gui.dime__HYPHEN_MINUS__models.gui.librarianms.LibrarianMS_egaTkU1wEeyjn6oaCYeN5AResult("Submit", guiReturn);
		if(!"_egaTkU1wEeyjn6oaCYeN5A".equals(output.getCallStack().getCallFrames().get(output.getCallStack().getCallFrames().size()-1).getPointer().split(":")[2])){
					output.getCallStack().getCallFrames().get(output.getCallStack().getCallFrames().size()-1).setPointer(output.getCallStack().getCallFrames().get(output.getCallStack().getCallFrames().size()-1).getMajorGUI());
		}
		if(!output.getCallStack().getCallFrames().isEmpty()) {
		
			if(output.getCallStack().getCallFrames().get(output.getCallStack().getCallFrames().size() - 1).getPointer() == null) {
				return javax.ws.rs.core.Response.status(422).build();
			}
		}
		final Object result = this.processResumer.resumeFromGUI(output.getCallStack(), guiResult);
		return javax.ws.rs.core.Response.ok(result).build();
	}
	
}
