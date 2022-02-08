package de.ls5.dywa.generated.rest.types;

@com.fasterxml.jackson.annotation.JsonFilter("DIME_Selective_Filter")
@com.fasterxml.jackson.annotation.JsonIdentityInfo(generator = com.voodoodyne.jackson.jsog.JSOGGenerator.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS, property = info.scce.dime.util.Constants.DYWA_RUNTIME_TYPE)
public class ConcreteUserImpl extends info.scce.dime.rest.RESTBaseImpl implements ConcreteUser
 {

	private BaseUser
	 baseUser;
	private boolean isbaseUserSet;
	
	@com.fasterxml.jackson.annotation.JsonProperty("baseUser")
	@info.scce.dime.rest.JsonRenderIndicator("isbaseUserSet")
	@java.lang.Override
	public BaseUser
	 getbaseUser() {
		return this.baseUser;
	}
	
	@com.fasterxml.jackson.annotation.JsonIgnore
	public boolean isbaseUserSet() {
		return this.isbaseUserSet;
	}

	@com.fasterxml.jackson.annotation.JsonProperty("baseUser")
	@java.lang.Override
	public void setbaseUser(final BaseUser
	 baseUser) {
		this.baseUser = baseUser;
		this.isbaseUserSet = true;
	}

	private LMS
	 lMS;
	private boolean islMSSet;
	
	@com.fasterxml.jackson.annotation.JsonProperty("lMS")
	@info.scce.dime.rest.JsonRenderIndicator("islMSSet")
	@java.lang.Override
	public LMS
	 getlMS() {
		return this.lMS;
	}
	
	@com.fasterxml.jackson.annotation.JsonIgnore
	public boolean islMSSet() {
		return this.islMSSet;
	}

	@com.fasterxml.jackson.annotation.JsonProperty("lMS")
	@java.lang.Override
	public void setlMS(final LMS
	 lMS) {
		this.lMS = lMS;
		this.islMSSet = true;
	}

	private ConcreteUser
	 dywaSwitchedTo;
	private boolean isdywaSwitchedToSet;
	
	@com.fasterxml.jackson.annotation.JsonProperty("dywaSwitchedTo")
	@info.scce.dime.rest.JsonRenderIndicator("isdywaSwitchedToSet")
	@java.lang.Override
	public ConcreteUser
	 getdywaSwitchedTo() {
		return this.dywaSwitchedTo;
	}
	
	@com.fasterxml.jackson.annotation.JsonIgnore
	public boolean isdywaSwitchedToSet() {
		return this.isdywaSwitchedToSet;
	}

	@com.fasterxml.jackson.annotation.JsonProperty("dywaSwitchedTo")
	@java.lang.Override
	public void setdywaSwitchedTo(final ConcreteUser
	 dywaSwitchedTo) {
		this.dywaSwitchedTo = dywaSwitchedTo;
		this.isdywaSwitchedToSet = true;
	}

	
}
