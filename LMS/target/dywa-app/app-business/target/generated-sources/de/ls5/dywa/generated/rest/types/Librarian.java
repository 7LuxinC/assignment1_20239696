package de.ls5.dywa.generated.rest.types;

@com.fasterxml.jackson.annotation.JsonFilter("DIME_Selective_Filter")
@com.fasterxml.jackson.annotation.JsonIdentityInfo(generator = com.voodoodyne.jackson.jsog.JSOGGenerator.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS, property = info.scce.dime.util.Constants.DYWA_RUNTIME_TYPE)
public interface Librarian extends info.scce.dime.rest.RESTBaseType  {

	java.lang.String
	 getlastname();
	boolean islastnameSet();

	void setlastname(final java.lang.String
	 lastname);
	java.lang.String
	 getfirstname();
	boolean isfirstnameSet();

	void setfirstname(final java.lang.String
	 firstname);
	java.lang.Long
	 getid();
	boolean isidSet();

	void setid(final java.lang.Long
	 id);
	java.lang.String
	 getsection();
	boolean issectionSet();

	void setsection(final java.lang.String
	 section);
	java.lang.String
	 getposition();
	boolean ispositionSet();

	void setposition(final java.lang.String
	 position);

	public static Librarian fromDywaEntity(final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Librarian entity, info.scce.dime.rest.ObjectCache objectCache) {
	
		final Librarian result;
	
		if (entity instanceof de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Librarian) {
			result = new de.ls5.dywa.generated.rest.types.LibrarianImpl();
		}
	 else { throw new java.lang.IllegalArgumentException("Unknown type"); } 
		objectCache.putRestTo(entity, result);
	
		return result;
	}
}
