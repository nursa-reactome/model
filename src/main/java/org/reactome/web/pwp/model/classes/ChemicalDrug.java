package org.reactome.web.pwp.model.classes;

import com.google.gwt.json.client.JSONObject;
import com.google.gwt.resources.client.ImageResource;
import org.reactome.web.pwp.model.factory.DatabaseObjectUtils;
import org.reactome.web.pwp.model.factory.SchemaClass;
import org.reactome.web.pwp.model.images.DatabaseObjectImages;

/**
 * @author Antonio Fabregat <fabregat@ebi.ac.uk>
 */
public class ChemicalDrug extends Drug {

    private ReferenceMolecule referenceEntity;

    public ChemicalDrug() {
        super(SchemaClass.CHEMICAL_DRUG);
    }

    @Override
    public void load(JSONObject jsonObject) {
        super.load(jsonObject);

        if (jsonObject.containsKey("referenceEntity")) {
            this.referenceEntity = DatabaseObjectUtils.getDatabaseObject(jsonObject, "referenceEntity");
        }
    }

    public ReferenceMolecule getReferenceEntity() {
        return referenceEntity;
    }

    @Override
    public ImageResource getImageResource() {
        return DatabaseObjectImages.INSTANCE.chemicalDrug();
    }
}
