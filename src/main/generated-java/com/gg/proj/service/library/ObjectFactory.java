//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.7 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2019.02.01 à 06:55:10 PM CET 
//


package com.gg.proj.service.library;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.gg.proj.service.library package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.gg.proj.service.library
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetLanguageResponse }
     * 
     */
    public GetLanguageResponse createGetLanguageResponse() {
        return new GetLanguageResponse();
    }

    /**
     * Create an instance of {@link Language }
     * 
     */
    public Language createLanguage() {
        return new Language();
    }

    /**
     * Create an instance of {@link GetBookResponse }
     * 
     */
    public GetBookResponse createGetBookResponse() {
        return new GetBookResponse();
    }

    /**
     * Create an instance of {@link Book }
     * 
     */
    public Book createBook() {
        return new Book();
    }

    /**
     * Create an instance of {@link GetLibraryResponse }
     * 
     */
    public GetLibraryResponse createGetLibraryResponse() {
        return new GetLibraryResponse();
    }

    /**
     * Create an instance of {@link Library }
     * 
     */
    public Library createLibrary() {
        return new Library();
    }

    /**
     * Create an instance of {@link SearchBooksRequest }
     * 
     */
    public SearchBooksRequest createSearchBooksRequest() {
        return new SearchBooksRequest();
    }

    /**
     * Create an instance of {@link GetLanguageRequest }
     * 
     */
    public GetLanguageRequest createGetLanguageRequest() {
        return new GetLanguageRequest();
    }

    /**
     * Create an instance of {@link SearchBooksResponse }
     * 
     */
    public SearchBooksResponse createSearchBooksResponse() {
        return new SearchBooksResponse();
    }

    /**
     * Create an instance of {@link Topic }
     * 
     */
    public Topic createTopic() {
        return new Topic();
    }

    /**
     * Create an instance of {@link GetLibraryRequest }
     * 
     */
    public GetLibraryRequest createGetLibraryRequest() {
        return new GetLibraryRequest();
    }

    /**
     * Create an instance of {@link GetBookRequest }
     * 
     */
    public GetBookRequest createGetBookRequest() {
        return new GetBookRequest();
    }

    /**
     * Create an instance of {@link GetPagedBookListRequest }
     * 
     */
    public GetPagedBookListRequest createGetPagedBookListRequest() {
        return new GetPagedBookListRequest();
    }

    /**
     * Create an instance of {@link GetPagedBookListResponse }
     * 
     */
    public GetPagedBookListResponse createGetPagedBookListResponse() {
        return new GetPagedBookListResponse();
    }

}