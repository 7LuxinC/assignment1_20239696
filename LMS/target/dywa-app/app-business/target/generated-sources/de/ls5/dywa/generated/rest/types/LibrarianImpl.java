package de.ls5.dywa.generated.rest.types;

@com.fasterxml.jackson.annotation.JsonFilter("DIME_Selective_Filter")
@com.fasterxml.jackson.annotation.JsonIdentityInfo(generator = com.voodoodyne.jackson.jsog.JSOGGenerator.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS, property = info.scce.dime.util.Constants.DYWA_RUNTIME_TYPE)
public class LibrarianImpl extends info.scce.dime.rest.RESTBaseImpl implements Librarian
 {

	private java.lang.String
	 lastname;
	private boolean islastnameSet;
	
	@com.fasterxml.jackson.annotation.JsonProperty("lastname")
	@info.scce.dime.rest.JsonRenderIndicator("islastnameSet")
	@java.lang.Override
	public java.lang.String
	 getlastname() {
		return this.lastname;
	}
	
	@com.fasterxml.jackson.annotation.JsonIgnore
	public boolean islastnameSet() {
		return this.islastnameSet;
	}

	@com.fasterxml.jackson.annotation.JsonProperty("lastname")
	@java.lang.Override
	public void setlastname(final java.lang.String
	 lastname) {
		this.lastname = lastname;
		this.islastnameSet = true;
	}

	private java.lang.String
	 firstname;
	private boolean isfirstnameSet;
	
	@com.fasterxml.jackson.annotation.JsonProperty("firstname")
	@info.scce.dime.rest.JsonRenderIndicator("isfirstnameSet")
	@java.lang.Override
	public java.lang.String
	 getfirstname() {
		return this.firstname;
	}
	
	@com.fasterxml.jackson.annotation.JsonIgnore
	public boolean isfirstnameSet() {
		return this.isfirstnameSet;
	}

	@com.fasterxml.jackson.annotation.JsonProperty("firstname")
	@java.lang.Override
	public void setfirstname(final java.lang.String
	 firstname) {
		this.firstname = firstname;
		this.isfirstnameSet = true;
	}

	private java.lang.Long
	 id;
	private boolean isidSet;
	
	@com.fasterxml.jackson.annotation.JsonProperty("id")
	@info.scce.dime.rest.JsonRenderIndicator("isidSet")
	@java.lang.Override
	public java.lang.Long
	 getid() {
		return this.id;
	}
	
	@com.fasterxml.jackson.annotation.JsonIgnore
	public boolean isidSet() {
		return this.isidSet;
	}

	@com.fasterxml.jackson.annotation.JsonProperty("id")
	@java.lang.Override
	public void setid(final java.lang.Long
	 id) {
		this.id = id;
		this.isidSet = true;
	}

	private java.lang.String
	 section;
	private boolean issectionSet;
	
	@com.fasterxml.jackson.annotation.JsonProperty("section")
	@info.scce.dime.rest.JsonRenderIndicator("issectionSet")
	@java.lang.Override
	public java.lang.String
	 getsection() {
		return this.section;
	}
	
	@com.fasterxml.jackson.annotation.JsonIgnore
	public boolean issectionSet() {
		return this.issectionSet;
	}

	@com.fasterxml.jackson.annotation.JsonProperty("section")
	@java.lang.Override
	public void setsection(final java.lang.String
	 section) {
		this.section = section;
		this.issectionSet = true;
	}

	private java.lang.String
	 position;
	private boolean ispositionSet;
	
	@com.fasterxml.jackson.annotation.JsonProperty("position")
	@info.scce.dime.rest.JsonRenderIndicator("ispositionSet")
	@java.lang.Override
	public java.lang.String
	 getposition() {
		return this.position;
	}
	
	@com.fasterxml.jackson.annotation.JsonIgnore
	public boolean ispositionSet() {
		return this.ispositionSet;
	}

	@com.fasterxml.jackson.annotation.JsonProperty("position")
	@java.lang.Override
	public void setposition(final java.lang.String
	 position) {
		this.position = position;
		this.ispositionSet = true;
	}

	
}
