package com.company;

public class C1 {

    static public int nMax(double[] tab) throws EmptyArgException{
        //tab doit etre non null
        // non vide (=>EmptyArgException)

        if (tab != null){

            if (tab.length == 0) {
                throw new EmptyArgException("Le tableau ne doit pas être vide");
            }

            double nbMax = tab[0];
            int nbMaxCount = 1;

            for ( int i=1 ; i<tab.length ; i++){
                if ( nbMax < tab[i] ){
                    nbMax = tab[i];
                    nbMaxCount = 1;
                }else if ( nbMax == tab[i] ){
                    nbMaxCount++;
                }
            }

            return nbMaxCount;

        }else{
            throw new IllegalArgumentException("Le tableau ne doit pas être vide.");
        }

    }

}
