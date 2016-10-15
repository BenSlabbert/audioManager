package com.apress.springpersistence.audiomanager.core.domain;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Person.class)
public abstract class Person_ extends com.apress.springpersistence.audiomanager.core.domain.Thing_ {

	public static volatile SingularAttribute<Person, String> gender;
	public static volatile SingularAttribute<Person, String> telephone;
	public static volatile SingularAttribute<Person, String> email;

}

