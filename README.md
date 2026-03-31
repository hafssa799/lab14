# LAB 14 : Stockage de Données Sécurisé sous Android

Ce projet démontre l'implémentation de différentes méthodes de stockage de données dans une application Android, en mettant l'accent sur la sécurité et la persistance des données. Il couvre l'utilisation des préférences partagées (SharedPreferences), le stockage de fichiers JSON et l'utilisation de la bibliothèque Jetpack Security.

## Tâches réalisées

### 1. Configuration de l'environnement et Dépendances

   •Mise à jour du fichier build.gradle.kts pour utiliser le SDK 36 (Compile SDK).

   •Intégration de la bibliothèque AndroidX Security Crypto (1.1.0-alpha06) pour le chiffrement des données sensibles.

   •Résolution des conflits de métadonnées AAR liés aux versions des API Android.

        implementation("androidx.security:security-crypto:1.1.0-alpha06")
        

### 2. Stockage des Préférences (SharedPreferences)

   •Implémentation d'un système pour sauvegarder le nom d'utilisateur, la langue (fr/en) et le thème (clair/sombre).

   •Sécurisation du Token : Utilisation de EncryptedSharedPreferences pour stocker le jeton d'authentification (Token) de manière chiffrée sur l'appareil, empêchant sa lecture en clair par des applications tierces.

### 3. Gestion des fichiers externes (JSON)

    •Développement de la classe ExternalAppFilesStore.java pour gérer l'écriture et la lecture de fichiers dans le stockage externe de l'application.

    •Optimisation de la compatibilité : Remplacement des méthodes Files.writeString (Java 11) par Files.write pour assurer le bon fonctionnement sur les versions d'Android avec un minSdk 24.

    •Sérialisation et désérialisation de données utilisateur au format JSON.
   
### 4. Interface Utilisateur (UI)

•Création d'une interface intuitive avec Material Design 3.

•Gestion des événements sur les boutons :
    
    ◦Sauvegarder prefs : Persistance des paramètres utilisateur.
    
    ◦Charger prefs : Récupération et affichage des données stockées.
    
    ◦Sauvegarder fichier JSON : Exportation des données vers un fichier physique.
    
    ◦Effacer : Nettoyage de l'interface et réinitialisation des champs.

## Technologies Utilisées

    •Langages : Java (Logique métier) & Kotlin (Configuration Gradle).
    
    •Android SDK : API 36 (Compile), API 35 (Target), API 24 (Min).
    
    •Bibliothèques :
    
       ◦androidx.security:security-crypto
       
       ◦com.google.android.material:material
       
       ◦androidx.constraintlayout:constraintlayout
   

   
   
