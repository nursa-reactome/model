package org.reactome.web.pwp.model.classes;

import com.google.gwt.json.client.JSONObject;
import org.reactome.web.pwp.model.factory.DatabaseObjectUtils;
import org.reactome.web.pwp.model.factory.SchemaClass;

/**
 * @author Antonio Fabregat <fabregat@ebi.ac.uk>
 */
public abstract class Drug extends PhysicalEntity {

    private ReferenceTherapeutic referenceTherapeutic;

    Drug(SchemaClass schemaClass) {
        super(schemaClass);
    }

    @Override
    public void load(JSONObject jsonObject) {
        super.load(jsonObject);

        if (jsonObject.containsKey("referenceTherapeutic")) {
            this.referenceTherapeutic = DatabaseObjectUtils.getDatabaseObject(jsonObject, "referenceTherapeutic");
        }
    }

    public ReferenceTherapeutic getReferenceTherapeutic() {
        return referenceTherapeutic;
    }
}
