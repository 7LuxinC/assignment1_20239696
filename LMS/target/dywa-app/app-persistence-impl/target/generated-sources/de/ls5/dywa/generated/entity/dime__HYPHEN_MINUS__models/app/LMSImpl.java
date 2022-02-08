/* generated by info.scce.dime.generator.scheme.ModelGenerator */
package de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app;
@javax.persistence.Entity
@javax.persistence.Cacheable
@org.hibernate.annotations.Cache(usage = org.hibernate.annotations.CacheConcurrencyStrategy.READ_WRITE)
@javax.persistence.Table(name = "t_LMS__yh4gsu1veeyjn6o", indexes={@javax.persistence.Index(columnList="meta_inheritance")})
@de.ls5.dywa.annotations.IdRef(id = 2L)
public class LMSImpl implements LMS {
	@javax.persistence.Id
	@javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.SEQUENCE)
	@javax.persistence.Column(name = "meta_id")
	private long id_;
	
	/* DYWA METADATA START */
	@javax.persistence.Column(name = "meta_name")
	private java.lang.String name_;
	
	@javax.persistence.Column(name = "meta_version")
	private long version_;
	
	@javax.persistence.Column(name = "meta_inheritance")
	private boolean inheritance_ = false;


	@javax.persistence.Transient
	private boolean bidirectionalDirtyFlag;
	/* DYWA METADATA END */

	
	/* MAIN ATTRIBUTES START */
	@de.ls5.dywa.annotations.IdRef(id = 13L)
	@org.hibernate.annotations.Cascade(org.hibernate.annotations.CascadeType.PERSIST)
	@javax.persistence.JoinColumn(name = "a_Librarian__ypkyoe1veeyjn6o")
	@org.hibernate.annotations.Any(metaColumn=@javax.persistence.Column(name="m_Librarian_Type__ypkyoe1veeyjn6o"))
	@org.hibernate.annotations.AnyMetaDef(
		idType="long", metaType="string",
		metaValues={
			@org.hibernate.annotations.MetaValue(targetEntity=de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.LibrarianImpl.class, value="_d7i4wu1veeyjn6o")
		}
	)
	private de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Librarian librarian;
	
	@de.ls5.dywa.annotations.IdRef(id = 14L)
	@org.hibernate.annotations.Cascade(org.hibernate.annotations.CascadeType.PERSIST)
	@javax.persistence.JoinColumn(name = "a_ConcreteUser__zr1jge1veeyjn6o")
	@org.hibernate.annotations.Any(metaColumn=@javax.persistence.Column(name="m_ConcreteUser_Type__zr1jge1veeyjn6o"))
	@org.hibernate.annotations.AnyMetaDef(
		idType="long", metaType="string",
		metaValues={
			@org.hibernate.annotations.MetaValue(targetEntity=de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.ConcreteUserImpl.class, value="_dh6bymwneewzvvv")
		}
	)
	private de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.ConcreteUser concreteUser;
	
	/* MAIN ATTRIBUTES END */
	
	/* IMPLICIT ATTRIBUTES START */
	/* IMPLICIT ATTRIBUTES END */
	
	/* INHERITED MODELS START */
	/* INHERITED MODELS END */

	/* INHERITED ABSTRACT MODELS START */
	/* INHERITED ABSTRACT MODELS END */
	
	/* ADDITIONAL INHERITED MODELS START */
	/* ADDITIONAL INHERITED MODELS END */
	
	// Constructors
	public LMSImpl() {
	}



	// EXTENSION ATTRIBUTES

	public long getId_() {
		return this.id_;
	}

	public void setId_(final long id) {
		this.id_ = id;
	}

	@java.lang.Override
	public java.lang.String getDywaName() {
		return this.name_;
	}

	@java.lang.Override
	public void setDywaName(final java.lang.String name) {
		this.name_ = name;
	}

	// return existing id on runtime
	@java.lang.Override
	public long getDywaId() {
		return this.id_;
	}

	@java.lang.Override
	public long getDywaVersion() {
		return this.version_;
	}

	@java.lang.Override
	public void setDywaVersion(final long version) {
		this.version_ = version;
	}
	
	@java.lang.Override
	public de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Librarian getlibrarian() {
		return this.librarian;
	}
	
	@java.lang.Override
	public void setlibrarian(de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Librarian object) {
		this.librarian = object;
	}
	
	
	@java.lang.Override
	public de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.ConcreteUser getconcreteUser() {
		return this.concreteUser;
	}
	
	@java.lang.Override
	public void setconcreteUser(de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.ConcreteUser object) {
		if (!this.bidirectionalDirtyFlag) {
			this.bidirectionalDirtyFlag = true;
			final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.ConcreteUser current = this.getconcreteUser();
			final LMS _instance =
			this;
			if(current != null){
				current.setlMS(null);
			}
			if(object!=null){
				object.setlMS(_instance);
			}
			this.concreteUser = object;
			this.bidirectionalDirtyFlag = false;
		}
	}
	
	
	@java.lang.Override
	public String toString() {
		return "LMS[id: " + this.id_ + ", name: " + this.name_ + "]";
	}
}
