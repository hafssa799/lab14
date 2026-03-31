
# LAB 14 : Stockage de Données Sécurisé sous Android

Ce projet démontre l'implémentation de différentes méthodes de stockage de données dans une application Android, en mettant l'accent sur la sécurité et la persistance des données. Il couvre l'utilisation des préférences partagées (SharedPreferences), le stockage de fichiers JSON et l'utilisation de la bibliothèque Jetpack Security.

## Tâches réalisées

### 1. Configuration de l'environnement et Dépendances

   •Mise à jour du fichier build.gradle.kts pour utiliser le SDK 36 (Compile SDK).

   •Intégration de la bibliothèque AndroidX Security Crypto (1.1.0-alpha06) pour le chiffrement des données sensibles.

   •Résolution des conflits de métadonnées AAR liés aux versions des API Android.

        implementation("androidx.security:security-crypto:1.1.0-alpha06")
        

### 2. Stockage des Préférences (SharedPreferences)

  Guide d'utilisation :
  
  1.Saisissez un nom dans Nom utilisateur.
  
  2.Entrez une valeur secrète dans Token.
  
  3.Cliquez sur Sauvegarder prefs.
  
  4.Technique : Le Token est chiffré via EncryptedSharedPreferences. Même si un intrus accède aux fichiers de l'app, le Token reste illisible (chiffré en AES).

<img width="149" height="300" alt="image" src="https://github.com/user-attachments/assets/f75c23d4-5a43-4f38-b566-88d6bd5cc656" />

### 3. Gestion des fichiers externes (JSON)

    •Développement de la classe ExternalAppFilesStore.java pour gérer l'écriture et la lecture de fichiers dans le stockage externe de l'application.

    •Optimisation de la compatibilité : Remplacement des méthodes Files.writeString (Java 11) par Files.write pour assurer le bon fonctionnement sur les versions d'Android avec un minSdk 24.

    •Sérialisation et désérialisation de données utilisateur au format JSON.

   java
    // Pour écrire (Sauvegarder fichier JSON)
    Files.write(file.toPath(), content.getBytes(StandardCharsets.UTF_8));

    // Pour lire (Charger fichier JSON)
    byte[] bytes = Files.readAllBytes(file.toPath());

    
### 4. Interface Utilisateur (UI)

•Création d'une interface intuitive avec Material Design 3.

•Gestion des événements sur les boutons :
    
<img width="153" height="304" alt="image" src="https://github.com/user-attachments/assets/223346e9-39b4-4f72-9bfa-c616a565b095" />
    
 ◦Sauvegarder prefs : Persistance des paramètres utilisateur.
 
<img width="149" height="297" alt="image" src="https://github.com/user-attachments/assets/da050eb9-f304-46e9-8a06-fd920c5ef5a1" />

 ◦Charger prefs : Récupération et affichage des données stockées.
 
<img width="149" height="300" alt="image" src="https://github.com/user-attachments/assets/f75c23d4-5a43-4f38-b566-88d6bd5cc656" />

 ◦Sauvegarder fichier JSON : Exportation des données vers un fichier physique.
 
    <img width="146" height="289" alt="image" src="https://github.com/user-attachments/assets/45502bf9-06e5-4355-820b-bbbffb1526cb" />

    ◦Effacer : Nettoyage de l'interface et réinitialisation des champs.
    
<img width="146" height="303" alt="image" src="https://github.com/user-attachments/assets/2622c985-2191-4028-93fb-d3fe95ed62e4" />

## Technologies Utilisées

    •Langages : Java (Logique métier) & Kotlin (Configuration Gradle).
    
    •Android SDK : API 36 (Compile), API 35 (Target), API 24 (Min).
    
    •Bibliothèques :
    
       ◦androidx.security:security-crypto
       
       ◦com.google.android.material:material
       
       ◦androidx.constraintlayout:constraintlayout
   

   
   
