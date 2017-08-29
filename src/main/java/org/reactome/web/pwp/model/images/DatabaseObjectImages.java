package org.reactome.web.pwp.model.images;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ImageResource;

/**
 * @author Antonio Fabregat <fabregat@ebi.ac.uk>
 */
public interface DatabaseObjectImages extends ClientBundle {

    DatabaseObjectImages INSTANCE = GWT.create(DatabaseObjectImages.class);

    @Source("BlackBoxEvent.png")
    ImageResource blackBoxEvent();

    @Source("CandidateSet.png")
    ImageResource candidateSet();

    @Source("ChemicalDrug.png")
    ImageResource chemicalDrug();

    @Source("Complex.png")
    ImageResource complex();

    @Source("ConceptualEvent.png")
    ImageResource conceptualEvent();

    @Source("DefinedSet.png")
    ImageResource definedSet();

    @Source("Depolymerization.png")
    ImageResource depolymerization();

    @Source("EntitySet.png")
    ImageResource entitySet();

    @Source("EntityWithAccessionedSequence.png")
    ImageResource entityWithAccessionedSequence();

    @Source("EquivalentEventSet.png")
    ImageResource equivalentEventSet();

    @Source("exclamation.png")
    ImageResource exclamation();

    @Source("FailedReaction.gif")
    ImageResource failedReaction();

    @Source("GenomeEncodeEntity.png")
    ImageResource genomeEncodeEntity();

    @Source("isDisease.png")
    ImageResource isDisease();

    @Source("isInferred.png")
    ImageResource isInferred();

    @Source("NewTag.png")
    ImageResource isNew();

    @Source("UpdateTag.png")
    ImageResource isUpdated();

    @Source("OpenSet.png")
    ImageResource openSet();

    @Source("OtherEntity.png")
    ImageResource otherEntity();

    @Source("Pathway.png")
    ImageResource pathway();

    @Source("Polymer.png")
    ImageResource polymer();

    @Source("Polymerization.png")
    ImageResource polymerization();

    @Source("Reaction.png")
    ImageResource reaction();

    @Source("ReferenceDNASequence.png")
    ImageResource referenceDNASequence();

    @Source("ReferenceGroup.png")
    ImageResource referenceGroup();

    @Source("ReferenceRNASequence.png")
    ImageResource referenceRNASequence();

    @Source("Regulator.png")
    ImageResource regulator();

    @Source("SimpleEntity.png")
    ImageResource simpleEntity();

}
