package com.apress.springpersistence.audiomanager.core.domain;

import java.net.URL;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Thing.class)
public abstract class Thing_ {

	public static volatile SingularAttribute<Thing, URL> image;
	public static volatile SingularAttribute<Thing, URL> additionalType;
	public static volatile SingularAttribute<Thing, String> name;
	public static volatile SingularAttribute<Thing, String> description;
	public static volatile SingularAttribute<Thing, String> alternateName;
	public static volatile SingularAttribute<Thing, Long> id;
	public static volatile SingularAttribute<Thing, Integer> version;
	public static volatile SingularAttribute<Thing, URL> url;
	public static volatile SingularAttribute<Thing, URL> sameAs;

}

