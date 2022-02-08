package de.ls5.dywa.generated.rest.types;

@com.fasterxml.jackson.annotation.JsonFilter("DIME_Selective_Filter")
@com.fasterxml.jackson.annotation.JsonIdentityInfo(generator = com.voodoodyne.jackson.jsog.JSOGGenerator.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS, property = info.scce.dime.util.Constants.DYWA_RUNTIME_TYPE)
public class LMSImpl extends info.scce.dime.rest.RESTBaseImpl implements LMS
 {

	private Librarian
	 librarian;
	private boolean islibrarianSet;
	
	@com.fasterxml.jackson.annotation.JsonProperty("librarian")
	@info.scce.dime.rest.JsonRenderIndicator("islibrarianSet")
	@java.lang.Override
	public Librarian
	 getlibrarian() {
		return this.librarian;
	}
	
	@com.fasterxml.jackson.annotation.JsonIgnore
	public boolean islibrarianSet() {
		return this.islibrarianSet;
	}

	@com.fasterxml.jackson.annotation.JsonProperty("librarian")
	@java.lang.Override
	public void setlibrarian(final Librarian
	 librarian) {
		this.librarian = librarian;
		this.islibrarianSet = true;
	}

	private ConcreteUser
	 concreteUser;
	private boolean isconcreteUserSet;
	
	@com.fasterxml.jackson.annotation.JsonProperty("concreteUser")
	@info.scce.dime.rest.JsonRenderIndicator("isconcreteUserSet")
	@java.lang.Override
	public ConcreteUser
	 getconcreteUser() {
		return this.concreteUser;
	}
	
	@com.fasterxml.jackson.annotation.JsonIgnore
	public boolean isconcreteUserSet() {
		return this.isconcreteUserSet;
	}

	@com.fasterxml.jackson.annotation.JsonProperty("concreteUser")
	@java.lang.Override
	public void setconcreteUser(final ConcreteUser
	 concreteUser) {
		this.concreteUser = concreteUser;
		this.isconcreteUserSet = true;
	}

	
}
