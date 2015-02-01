/*
  Copyright 2006 by Sean Luke
  Licensed under the Academic Free License version 3.0
  See the file "LICENSE" for more information
*/



package ec.app.canonical.breastcancer.ts;

import ec.*;
import ec.app.canonical.breastcancer.DoubleData;
import ec.app.canonical.breastcancer.BreastCancer;
import ec.gp.*;
import ec.util.*;

public class WDBC25 extends GPNode
    {
    public String toString() { return "wdbc25"; }

    public void checkConstraints(final EvolutionState state,
        final int tree,
        final GPIndividual typicalIndividual,
        final Parameter individualBase)
        {
        super.checkConstraints(state,tree,typicalIndividual,individualBase);
        if (children.length!=0)
            state.output.error("Incorrect number of children for node " + 
                toStringForError() + " at " +
                individualBase);
        }

    public void eval(final EvolutionState state,
        final int thread,
        final GPData input,
        final ADFStack stack,
        final GPIndividual individual,
        final Problem problem)
        {
          DoubleData rd = ((DoubleData)(input));
          rd.x = ((BreastCancer)problem).wdbc25;
        }
    }
