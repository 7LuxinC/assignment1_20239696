/* generated by info.scce.dime.generator.scheme.ModelGenerator */
package de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app;
@de.ls5.dywa.annotations.IdRef(id = 3L)
@de.ls5.dywa.annotations.OriginalName(name = "Librarian")
@de.ls5.dywa.annotations.ShortDescription(description = "")
@de.ls5.dywa.annotations.LongDescription(description = "")
public interface Librarian extends de.ls5.dywa.generated.util.Identifiable {
	@de.ls5.dywa.annotations.IdRef(id = 15L)
	@de.ls5.dywa.annotations.OriginalName(name = "lastname")
	@de.ls5.dywa.annotations.ShortDescription(description = "")
	@de.ls5.dywa.annotations.LongDescription(description = "")
	java.lang.String getlastname();
	
	@de.ls5.dywa.annotations.IdRef(id = 15L)
	@de.ls5.dywa.annotations.OriginalName(name = "lastname")
	@de.ls5.dywa.annotations.ShortDescription(description = "")
	@de.ls5.dywa.annotations.LongDescription(description = "")
	void setlastname(java.lang.String object);
	
	@de.ls5.dywa.annotations.IdRef(id = 16L)
	@de.ls5.dywa.annotations.OriginalName(name = "firstname")
	@de.ls5.dywa.annotations.ShortDescription(description = "")
	@de.ls5.dywa.annotations.LongDescription(description = "")
	java.lang.String getfirstname();
	
	@de.ls5.dywa.annotations.IdRef(id = 16L)
	@de.ls5.dywa.annotations.OriginalName(name = "firstname")
	@de.ls5.dywa.annotations.ShortDescription(description = "")
	@de.ls5.dywa.annotations.LongDescription(description = "")
	void setfirstname(java.lang.String object);
	
	@de.ls5.dywa.annotations.IdRef(id = 17L)
	@de.ls5.dywa.annotations.OriginalName(name = "id")
	@de.ls5.dywa.annotations.ShortDescription(description = "")
	@de.ls5.dywa.annotations.LongDescription(description = "")
	java.lang.Long getid();
	
	@de.ls5.dywa.annotations.IdRef(id = 17L)
	@de.ls5.dywa.annotations.OriginalName(name = "id")
	@de.ls5.dywa.annotations.ShortDescription(description = "")
	@de.ls5.dywa.annotations.LongDescription(description = "")
	void setid(java.lang.Long object);
	
	@de.ls5.dywa.annotations.IdRef(id = 18L)
	@de.ls5.dywa.annotations.OriginalName(name = "section")
	@de.ls5.dywa.annotations.ShortDescription(description = "")
	@de.ls5.dywa.annotations.LongDescription(description = "")
	java.lang.String getsection();
	
	@de.ls5.dywa.annotations.IdRef(id = 18L)
	@de.ls5.dywa.annotations.OriginalName(name = "section")
	@de.ls5.dywa.annotations.ShortDescription(description = "")
	@de.ls5.dywa.annotations.LongDescription(description = "")
	void setsection(java.lang.String object);
	
	@de.ls5.dywa.annotations.IdRef(id = 19L)
	@de.ls5.dywa.annotations.OriginalName(name = "position")
	@de.ls5.dywa.annotations.ShortDescription(description = "")
	@de.ls5.dywa.annotations.LongDescription(description = "")
	java.lang.String getposition();
	
	@de.ls5.dywa.annotations.IdRef(id = 19L)
	@de.ls5.dywa.annotations.OriginalName(name = "position")
	@de.ls5.dywa.annotations.ShortDescription(description = "")
	@de.ls5.dywa.annotations.LongDescription(description = "")
	void setposition(java.lang.String object);
	

	// EXTENSION ATTRIBUTES

	// CUSTOM LIST IMPL
	static class CustomListImpl<T extends de.ls5.dywa.generated.util.Identifiable> extends java.util.AbstractList<de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Librarian> {
	
		private final java.util.List<de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Librarian> delegate;
		private final BiDirectionalHelper<T> bidirectionalHelper;
		private boolean bidirectionalDirtyFlag;
	
		public CustomListImpl(final java.util.List<de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Librarian> delegate) {
			this(delegate, null);
		}
	
		public CustomListImpl(final java.util.List<de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Librarian> delegate, final BiDirectionalHelper<T> bidirectionalHelper) {
			this.delegate = delegate;
			this.bidirectionalHelper = bidirectionalHelper;
		}
	
		@java.lang.Override
		public int size() {
			return this.delegate.size();
		}
	
		@java.lang.Override
		public de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Librarian get(int index) {
				return this.delegate.get(index);
		}
	
		@java.lang.Override
		public de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Librarian set(int index, de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Librarian element) {
	
			final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Librarian replaced = this.delegate.set(index, element);
	
			if (element.equals(replaced)) {
				return element;
			}
	
			if (this.bidirectionalHelper != null) {
				this.bidirectionalHelper.clearReference(element);
				this.bidirectionalHelper.setReference(replaced);
			}
	
			return replaced;
		}
	
		@java.lang.Override
		public void add(int index, de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Librarian element) {
	
			if (!this.bidirectionalDirtyFlag) {
	
				this.bidirectionalDirtyFlag = true;
	
				this.delegate.add(index, element);
	
				if (this.bidirectionalHelper != null) {
					bidirectionalHelper.setReference(element);
				}
	
				this.bidirectionalDirtyFlag = false;
			}
		}
	
		@java.lang.Override
		public de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Librarian remove(int index) {
	
			if (!this.bidirectionalDirtyFlag) {
	
				this.bidirectionalDirtyFlag = true;
				final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Librarian result = this.delegate.remove(index);
	
				if (this.bidirectionalHelper != null) {
					this.bidirectionalHelper.clearReference(result);
				}
	
				this.bidirectionalDirtyFlag = false;
				return result;
			}
	
			return null;
		}
	}
	
	static class BiDirectionalHelper<T extends de.ls5.dywa.generated.util.Identifiable> {
	
		final java.util.function.BiConsumer<de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Librarian, T> setter;
		final java.util.function.Function<de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Librarian, java.util.List<T>> getter;
		final T owner;
	
		public BiDirectionalHelper(
				java.util.function.BiConsumer<de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Librarian, T> setter,
				T owner) {
	
			this.setter = setter;
			this.getter = null;
			this.owner = owner;
		}
	
		public BiDirectionalHelper(
				java.util.function.Function<de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Librarian, java.util.List<T>> getter,
				T owner) {
	
			this.setter = null;
			this.getter = getter;
			this.owner = owner;
		}
	
		public void setReference(final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Librarian p) {
	
			// list mode
			if (this.getter != null) {
				getter.apply(p).add(owner);
			}
			// single mode
			else {
				setter.accept(p, owner);
			}
		}
	
		public void clearReference(final de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.Librarian p) {
	
			// list mode
			if (this.getter != null) {
				getter.apply(p).remove(owner);
			}
			// single mode
			else {
				setter.accept(p, null);
			}
		}
	}

	default Librarian casted(){
		return this;
	}
}