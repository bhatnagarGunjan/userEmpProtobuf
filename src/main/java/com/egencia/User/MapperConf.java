package com.egencia.User;

import UsrStruct.UserStruct;
import ma.glasnost.orika.Converter;
import ma.glasnost.orika.Mapper;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.ObjectFactory;
import ma.glasnost.orika.impl.ConfigurableMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import java.util.Map;


@Component
public class MapperConf extends ConfigurableMapper  {

    private ApplicationContext applicationContext;

    private MapperFactory mapperFactory;

    public MapperConf() {
        super(false);
    }

    @Autowired
    public void setApplicationContext(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
        this.init();

    }

//    @Autowired
//    private CustomMap customMap;

//    @Autowired
//    public MapperConf(ApplicationContext applicationContext){
//        this.applicationContext=applicationContext;
//    }



    @Override
    protected void configure(MapperFactory factory) {
        super.configure(factory);
        this.mapperFactory = factory;
        addSpringMappers();
        addSpringConverter();

    }
    private void addSpringMappers() {
        @SuppressWarnings("rawtypes")
        final Map<String, Mapper> mappers = applicationContext
                .getBeansOfType(Mapper.class);
        for (final Mapper<?, ?> mapper : mappers.values()) {
            addMapper(mapper);
        }
    }
    private void addMapper(Mapper<?, ?> mapper) {
        this.mapperFactory.registerMapper(mapper);
    }

    public MapperFactory getMapperFactory() {
        return mapperFactory;
    }


    private void addSpringConverter() {
        @SuppressWarnings("rawtypes")
        final Map<String, Converter> converters = applicationContext
                .getBeansOfType(Converter.class);
        for (final Converter<?,?> converter : converters.values()) {
            addConverter(converter);
        }
    }
    private void addConverter(Converter<?, ?> converter) {
        this.mapperFactory.getConverterFactory().registerConverter(converter);
    }

    private void addSpringObjectFactories() {
        @SuppressWarnings("rawtypes") final Map<String, ObjectFactory> objectFactories = applicationContext.getBeansOfType(ObjectFactory.class);

        for (final Map.Entry<String, ObjectFactory> entry : objectFactories.entrySet()) {
            addObjectFactory(entry);
        }
    }
        private void addObjectFactory(Map.Entry<?,?> entry){
//            final ObjectFactory factory=(ObjectFactory)entry.getValue();
//            final Class<? extends ObjectFactory> ob=factory.getClass();
            this.mapperFactory.registerObjectFactory(new MyObjectMapper(), UserStruct.User.Builder.class);
            //addObjectFactories(objectFactory);
        }
    }

//    private ApplicationContext applicationContext;
//    private MapperFactory mapperFactory;
//
//    @Autowired
//    public void setApplicationContext(ApplicationContext applicationContext){
//        this.applicationContext=applicationContext;
////        addSpringConverters();
//    }
//
//    @Override
//    protected void configure(MapperFactory factory) {
//        factory.registerMapper(new CustomMap());
//    }
////




