package de.ls5.dywa.generated.util;

public class TypeInfo {
	private static java.util.Map<Long, java.lang.Class<?>> idToClassMap = new java.util.HashMap<>();
	private static java.util.Map<Long, java.util.Map<Long, String>> typeFieldNamesMap = new java.util.HashMap<>();
	private static java.util.Map<Long, String> typeNamesMap = new java.util.HashMap<>();
	private static java.util.Set<Long> enumTypes = new java.util.HashSet<>();
	private static java.util.Set<Long> allTypes = new java.util.HashSet<>();
	
	static {
		/* DBType _dh6bymwneewzvvv */
		typeNamesMap.put(0L, "ConcreteUser");
		idToClassMap.put(0L, de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.ConcreteUserImpl.class);
		allTypes.add(0L);
		java.util.Map<Long, String> map0 = new java.util.HashMap<Long, String>();
		map0.put(4L, "baseUser");
		map0.put(5L, "lMS");
		map0.put(6L, "dywaSwitchedTo");
		typeFieldNamesMap.put(0L, map0);
		/* DBType _udys4mwneewzvvv */
		typeNamesMap.put(1L, "BaseUser");
		idToClassMap.put(1L, de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.BaseUserImpl.class);
		allTypes.add(1L);
		java.util.Map<Long, String> map1 = new java.util.HashMap<Long, String>();
		map1.put(7L, "concreteUser");
		map1.put(8L, "password");
		map1.put(9L, "image");
		map1.put(10L, "firstName");
		map1.put(11L, "lastName");
		map1.put(12L, "username");
		typeFieldNamesMap.put(1L, map1);
		/* DBType _yh4gsu1veeyjn6o */
		typeNamesMap.put(2L, "LMS");
		idToClassMap.put(2L, de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.LMSImpl.class);
		allTypes.add(2L);
		java.util.Map<Long, String> map2 = new java.util.HashMap<Long, String>();
		map2.put(13L, "librarian");
		map2.put(14L, "concreteUser");
		typeFieldNamesMap.put(2L, map2);
		/* DBType _d7i4wu1veeyjn6o */
		typeNamesMap.put(3L, "Librarian");
		idToClassMap.put(3L, de.ls5.dywa.generated.entity.dime__HYPHEN_MINUS__models.app.LibrarianImpl.class);
		allTypes.add(3L);
		java.util.Map<Long, String> map3 = new java.util.HashMap<Long, String>();
		map3.put(15L, "lastname");
		map3.put(16L, "firstname");
		map3.put(17L, "id");
		map3.put(18L, "section");
		map3.put(19L, "position");
		typeFieldNamesMap.put(3L, map3);
	}
	
	public static String getGeneratedClassName(Long typeId) {
		java.lang.Class<?> clazz =  idToClassMap.get(typeId);
		return clazz != null ? clazz.getName() : null;
	}
	
	public static java.lang.Class<?> getGeneratedClass(Long typeId) {
		return idToClassMap.get(typeId);
	}
	
	public static java.util.Collection<Class<?>> getAllGeneratedClasses() {
		return idToClassMap.values();
	}
	
	public static java.util.List<String> getAllGeneratedClassNames() {
		return idToClassMap.values().stream().map(Class::getName).collect(java.util.stream.Collectors.toList());
	}
	
	public static boolean isEnumerable(Long id) {
		return enumTypes.contains(id);
	}
	
	public static boolean typeInUse(Long typeId) {
		return allTypes.contains(typeId);
	}
	
	public static java.util.Map<Long, String> getTypeFieldNames(Long typeId) {
		return typeFieldNamesMap.get(typeId);
	}
	
	public static String getTypeName(Long id) {
		return typeNamesMap.get(id);
	}
}
