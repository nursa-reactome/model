package org.reactome.web.pwp.model.classes;

import com.google.gwt.json.client.JSONObject;
import org.reactome.web.pwp.model.factory.DatabaseObjectUtils;
import org.reactome.web.pwp.model.factory.SchemaClass;

/**
 * @author Antonio Fabregat <fabregat@ebi.ac.uk>
 */
public class RNADrug extends Drug {

    private ReferenceRNASequence referenceEntity;

    public RNADrug() {
        super(SchemaClass.RNA_DRUG);
    }

    @Override
    public void load(JSONObject jsonObject) {
        super.load(jsonObject);

        if (jsonObject.containsKey("referenceEntity")) {
            this.referenceEntity = DatabaseObjectUtils.getDatabaseObject(jsonObject, "referenceEntity");
        }
    }

    public ReferenceRNASequence getReferenceEntity() {
        return referenceEntity;
    }
}
