package com.example;

import junit.framework.TestCase;
import presentation.Presentation2;

/**
 * Tests unitaires et exécution du TP.
 */
public class AppTest extends TestCase {

    /**
     * Test d'exécution du conteneur dynamique Presentation2.
     * Lance le chargement dynamique et affiche le résultat attendu.
     */
    public void testPresentation2() {
        System.out.println("=== Exécution de Presentation2 (Chargement Dynamique & Réflexion) ===");
        Presentation2.main(new String[]{});
    }
}
