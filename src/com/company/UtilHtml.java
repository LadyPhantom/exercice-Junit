package com.company;

public class UtilHtml {

    /** retourne une représentation HTML d'un tableau...
     *
     * @param tab le tableau
     * @param maxRows le nombre maximum de lignes souhaité (doit être >= 0)
     *
     * @return Si le tableau est vide, la méthode retourne la chaine "(vide)"
     *         si le tableau contient moins de maxRows lignes, le deuxième
     *         paramètre). Il y a autant de <tr>
     *         que d'éléments dans le tableau à concurrence de maxRows lignes,
     *         s'il le nombre d'éléments dans le tableau est supérieur à maxRows,
     *         la dernière ligne sera définie par "..."
     *
     * <pre>
     *     toHtmlTab( {"A", "B"}, 2 )
     *     => "<table><tr><td>A</td></tr><tr><td>B</td></tr></table>"
     * </pre>
     */
    public String toHtmlTab(Object[] tab, int maxRows) {

        if (maxRows <= 0){
            throw new IllegalArgumentException("call toHtmlTab with maxRow <=0");
        }

        String result = "<table>";

        if ( tab.length == 0 ){

            return "(vide)";

        }else{

            if ( maxRows<=0 ) return result + "<tr><td>...</td></tr></table>";

            if ( maxRows > tab.length ) maxRows = tab.length; //-1?

            for ( int i=0 ; i < maxRows ; i++ ){

                if ( (maxRows == (tab.length/2)) && (i == (maxRows-1)) ){
                    result+= "<tr><td>...</td></tr></table>";
                    return result;
                }

                if ( (maxRows == (tab.length-1)) && (i == (maxRows-1)) ){
                    return result+= "<tr><td>...</td></tr></table>";
                }

                result += "<tr><td>" + tab[i] + "</td></tr>";

            }

            /*if (maxRows == (tab.length-1)){

                for (int i = 0 ; i<(maxRows-1) ; i++){
                    result += "<tr><td>" + tab[i] + "</td></tr>";
                }
                result+= "<tr><td>...</td></tr></table>";

                return result;

            }else if(maxRows == (tab.length/2)){

                for (int i = 0 ; i<(maxRows-1) ; i++){
                    result += "<tr><td>" + tab[i] + "</td></tr>";
                }
                result+= "<tr><td>...</td></tr></table>";

                return result ;

            }else{

                for ( int i=0 ; i < maxRows ; i++ ){

                    result += "<tr><td>" + tab[i] + "</td></tr>";

                }

            }

*/
            if ( maxRows < tab.length ) result+= "<tr><td>...</td></tr>";
            return result + "</table>";

        }

    }

}
