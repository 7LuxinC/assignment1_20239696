package de.ls5.dywa.generated.rest.types;

@com.fasterxml.jackson.annotation.JsonFilter("DIME_Selective_Filter")
@com.fasterxml.jackson.annotation.JsonIdentityInfo(generator = com.voodoodyne.jackson.jsog.JSOGGenerator.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS, property = info.scce.dime.util.Constants.DYWA_RUNTIME_TYPE)
public interface LMS extends info.scce.dime.rest.RESTBaseType  {

	Librarian
	 getlibrarian();
	boolean islibrarianSet();

	void setlibrarian(final Librarian
	 librarian);
	ConcreteUser
	 getconcreteUser();
	boolean isconcreteUserSet();

	void setconcreteUser(final ConcreteUser
	 concreteUser);

	public static LMS fromDywaEntity(final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.LMS entity, info.scce.dime.rest.ObjectCache objectCache) {
	
		final LMS result;
	
		if (entity instanceof de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.LMS) {
			result = new de.ls5.dywa.generated.rest.types.LMSImpl();
		}
	 else { throw new java.lang.IllegalArgumentException("Unknown type"); } 
		objectCache.putRestTo(entity, result);
	
		return result;
	}
}
