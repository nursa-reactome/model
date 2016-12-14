package org.reactome.web.pwp.model.handlers;

import org.reactome.web.pwp.model.classes.DatabaseObject;

import java.util.List;

/**
 * @author Antonio Fabregat <fabregat@ebi.ac.uk>
 */
public interface DatabaseObjectsLoadedHandler<T extends DatabaseObject> {
    void onDatabaseObjectLoaded(List<T> objects);
    void onDatabaseObjectError(Throwable trThrowable);
}
