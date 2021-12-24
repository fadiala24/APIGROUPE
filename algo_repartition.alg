<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description courant="AFFICHER c" texte=""/>
    <extension extnom="inactif"/>
    <fonction fctcode="" fctetat="inactif"/>
    <F2 F2lignes="" F2defaut="" F2para="" F2etat="inactif"/>
    <repere repcode="-10#10#-10#10#2#2" repetat="inactif"/>
    <param nbDecimales="8" totalBoucles="5000000" epaisseurLigne="2" epaisseurPoint="2" totalAffichages="1000" arrondiAuto="vrai" maxBoucle="500000"/>
    <item code="200#declarationfonctions" algoitem="FONCTIONS_UTILISEES"/>
    <item code="100#declarationsvariables" algoitem="VARIABLES">
        <item code="1#NOMBRE#napp" algoitem="napp EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#ngpe" algoitem="ngpe EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#c" algoitem="c EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#c2" algoitem="c2 EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#c3" algoitem="c3 EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#n1" algoitem="n1 EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#n2" algoitem="n2 EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#nbapg" algoitem="nbapg EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#Reste" algoitem="Reste EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#diff" algoitem="diff EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#nouvapp" algoitem="nouvapp EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#recep_Reste" algoitem="recep_Reste EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#nv" algoitem="nv EST_DU_TYPE NOMBRE"/>
    </item>
    <item code="101#debutalgo" algoitem="DEBUT_ALGORITHME">
        <item code="2#napp#pasliste" algoitem="LIRE napp"/>
        <item code="2#ngpe#pasliste" algoitem="LIRE ngpe"/>
        <item code="5#c#0#pasliste" algoitem="c PREND_LA_VALEUR 0"/>
        <item code="5#c2#0#pasliste" algoitem="c2 PREND_LA_VALEUR 0"/>
        <item code="5#c3#0#pasliste" algoitem="c3 PREND_LA_VALEUR 0"/>
        <item code="5#n1#0#pasliste" algoitem="n1 PREND_LA_VALEUR 0"/>
        <item code="5#n2#0#pasliste" algoitem="n2 PREND_LA_VALEUR 0"/>
        <item code="5#nv#napp/ngpe#pasliste" algoitem="nv PREND_LA_VALEUR napp/ngpe"/>
        <item code="5#nbapg#floor(nv)#pasliste" algoitem="nbapg PREND_LA_VALEUR floor(nv)"/>
        <item code="6#napp%ngpe==0" algoitem="SI (napp%ngpe==0) ALORS">
            <item code="7#debutsi" algoitem="DEBUT_SI"/>
            <item code="15#c&lt;ngpe" algoitem="TANT_QUE (c&lt;ngpe) FAIRE">
                <item code="16#debuttantque" algoitem="DEBUT_TANT_QUE"/>
                <item code="5#c#c+1#pasliste" algoitem="c PREND_LA_VALEUR c+1"/>
                <item code="3#nbapg#1#pasliste" algoitem="AFFICHER nbapg"/>
                <item code="17#fintantque" algoitem="FIN_TANT_QUE"/>
            </item>
            <item code="8#finsi" algoitem="FIN_SI"/>
            <item code="9#sinon" algoitem="SINON">
                <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                <item code="5#n1#nbapg#pasliste" algoitem="n1 PREND_LA_VALEUR nbapg"/>
                <item code="5#n2#n1+1#pasliste" algoitem="n2 PREND_LA_VALEUR n1+1"/>
                <item code="5#nouvapp#napp#pasliste" algoitem="nouvapp PREND_LA_VALEUR napp"/>
                <item code="5#Reste#napp%ngpe#pasliste" algoitem="Reste PREND_LA_VALEUR napp%ngpe"/>
                <item code="5#diff#ngpe-Reste#pasliste" algoitem="diff PREND_LA_VALEUR ngpe-Reste"/>
                <item code="5#recep_Reste#Reste#pasliste" algoitem="recep_Reste PREND_LA_VALEUR Reste"/>
                <item code="4#apprenant non affecté est : #0" algoitem="AFFICHER &quot;apprenant non affecté est : &quot;"/>
                <item code="3#recep_Reste#1#pasliste" algoitem="AFFICHER recep_Reste"/>
                <item code="15#c2&lt;recep_Reste" algoitem="TANT_QUE (c2&lt;recep_Reste) FAIRE">
                    <item code="16#debuttantque" algoitem="DEBUT_TANT_QUE"/>
                    <item code="5#c2#c2+1#pasliste" algoitem="c2 PREND_LA_VALEUR c2+1"/>
                    <item code="4#Le nombre d'apprenant dans le groupe #0" algoitem="AFFICHER &quot;Le nombre d'apprenant dans le groupe &quot;"/>
                    <item code="3#c#0#pasliste" algoitem="AFFICHER c"/>
                    <item code="4# : #0" algoitem="AFFICHER &quot; : &quot;"/>
                    <item code="3#n2#1#pasliste" algoitem="AFFICHER n2"/>
                    <item code="17#fintantque" algoitem="FIN_TANT_QUE"/>
                </item>
                <item code="15#c3&lt;diff" algoitem="TANT_QUE (c3&lt;diff) FAIRE">
                    <item code="16#debuttantque" algoitem="DEBUT_TANT_QUE"/>
                    <item code="5#c3#c3+1#pasliste" algoitem="c3 PREND_LA_VALEUR c3+1"/>
                    <item code="4#Le nombre d'apprenant dans le groupe est:#0" algoitem="AFFICHER &quot;Le nombre d'apprenant dans le groupe est:&quot;"/>
                    <item code="4# : #0" algoitem="AFFICHER &quot; : &quot;"/>
                    <item code="3#n1#1#pasliste" algoitem="AFFICHER n1"/>
                    <item code="17#fintantque" algoitem="FIN_TANT_QUE"/>
                </item>
                <item code="11#finsinon" algoitem="FIN_SINON"/>
            </item>
        </item>
    </item>
    <item code="102#finalgo" algoitem="FIN_ALGORITHME"/>
</Algo>
