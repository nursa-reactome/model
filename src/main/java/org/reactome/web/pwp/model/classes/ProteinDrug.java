package org.reactome.web.pwp.model.classes;

import com.google.gwt.json.client.JSONObject;
import org.reactome.web.pwp.model.factory.DatabaseObjectUtils;
import org.reactome.web.pwp.model.factory.SchemaClass;

/**
 * @author Antonio Fabregat <fabregat@ebi.ac.uk>
 */
public class ProteinDrug extends Drug {

    private ReferenceGeneProduct referenceEntity;

    public ProteinDrug() {
        super(SchemaClass.PROTEIN_DRUG);
    }

    @Override
    public void load(JSONObject jsonObject) {
        super.load(jsonObject);

        if (jsonObject.containsKey("referenceEntity")) {
            this.referenceEntity = DatabaseObjectUtils.getDatabaseObject(jsonObject, "referenceEntity");
        }
    }

    public ReferenceGeneProduct getReferenceEntity() {
        return referenceEntity;
    }
}
