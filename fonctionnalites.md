# Projet Micro éditeur de figures géométriques.
## Fonctionnalités attendues
On désire créer un logiciel de dessin vectoriel dont le principe est de créer de nouveaux dessins en utilisant/modifiant/combinant des dessins existants. Plus précisément, nous voulons pouvoir :

1. Sélectionner un objet depuis un menu graphique (toolbar), et le positionner sur notre dessin – (whiteboard) en utilisant le glisser-déposer (drag and drop).
2. Créer des groupes d’objets et sous-groupes d’objets, sous-sous-groupes etc…
3. Dissocier un groupe d’objet.
4. Modifier la taille, position, etc… de nos objets ou groupes d’objets une fois ceux-ci incorporés dans le dessin.
5. Ajouter des groupes d’objets ou des objets paramétrés à notre toolbar en les déposants sur la toolbar (drag and drop).
6. Annuler ou refaire une opération.
7. Sauvegarder un document et charger un document.
8. Sauvegarder l’état du logiciel (toolbar) et le recharger au démarrage.

### Vous devez fournir au minimum les deux objets suivants :
* Un rectangle : Ses propriétés sont : largeur, hauteur, position, rotation, centre de rotation, translation, couleur et arrondi des bords.
* Un polygone régulier : Ses propriétés sont : nombre de côtés, longueur d’un côté, position, rotation, centre de rotation, translation, couleur.

## Observations générales
* On utilisera la bibliothèque JavaFX pour le rendu graphique.
* Tous les choix de patrons de conception utilisés seront justifiés dans le rapport.
* Il est demandé de rédiger des tests unitaires et d'intégration pertinents, notamment pour s'assurer du bon fonctionnement du mécanisme d'undo-redo. En particulier, on ne testera pas spécifiquement les classes de rendu graphique.
* Le rendu comportera un diagramme d'architecture.
* Pour faciliter la réutilisation de code, on prendra soin de séparer les objets gérant le rendu graphique, des objets contenant les données de la scène.

## Évaluation
* Comme pour les TDs + soutenances
## Détail des cas d'utilisation

Screenshot

### Cas 1. Glissé-déposer depuis toolbar.
1. L'utilisateur clique sur un élément de la toolbar.
2. Il effectue un glissé-déposer.
3. Il relache son clic :
    1. Au dessus de la feuille blanche, une nouvelle instance de l'objet est ajoutée à la feuille de dessin.
    2. Dans une icône "Poubelle", l'élément est supprimé de la toolbar.
    3. Ailleurs, rien ne se passe.
### Cas 2. Groupage.
1. L'utilisateur réalise une sélection potentiellement multiple d'objets.
    1. Soit via un rectangle de sélection sur le whiteboard.
    2. Soit par control-clics successifs.
2. Il sélectionne l'option "Group" d'un menu en clic-droit.
3. Les objets deviennent enfants d'un groupe d'objets.
### Cas 3. Dissociation d'un groupe.
1. L'utilisateur sélectionne un groupe d'objets.
2. Il sélectionne l'option "De-group" d'un menu en clic-droit.
3. Les objets sont dégroupés, c'est-à-dire rajoutés au groupe parent. Ils ne doivent pas changer de position, etc.
### Cas 4. Édition des propriétés des objets.
1. L'utilisateur sélectionne un objet ou un groupe d'objets.
2. Il réalise un clic droit et sélectionne "Edit" dans un menu déroulant.
3. Une boite de dialogue s'ouvre : elle contient les paramètres que l'on peut modifier.
4. L'utilisateur change un ou plusieurs des paramètres.
5. Il appuie sur :
    1. "Appliquer": les modifications sont appliquées, et il peut continuer à changer des paramètres.
    2. "Ok": les modifications sont appliquées et le dialogue se ferme.
    3. "Annuler": toutes les modifications réalisées depuis l'ouverture du dialogue sont annulées.

### Cas 5. Glissé-déposé vers toolbar.
1. L'utilisateur sélectionne un objet ou groupe d'objets.
2. Il effectue un drag'n'drop.
3. S'il relache la souris sur la toolbar, un nouvel élément est ajouté dans la toolbar.
4. S'il relache la souris sur la poubelle, les objets sont supprimés.

Cet élément contient les informations nécessaires pour créer des clones exacts de l'objet qui a été originellement drag'n'dropped, à l'exception de l'information de position. Note : S'il crée un nouveau document, les éléments de la toolbar sont conservés.

### Cas 6. Undo-Redo.
Ce cas s'applique aux opérations 1. à 5.

**Undo**: nécessite qu'au moins une action ait été réalisée.

    1. L'utilisateur clique sur le bouton Undo dans le menu.
    2. La dernière action réalisée par l'utilisateur est annulée : le document revient à son état précédent.

**Redo**: nécessite qu'au moins une action ait été annulée.

    1. L'utilisateur clique sur le bouton Redo dans le menu.
    2. La dernière action qui avait été annulée est rejouée.
### Cas 7. Sérialisation d'un document.
**Sauvegarde**

1. L'utilisateur appuie sur le bouton "Save".
2. Un dialogue s'ouvre et lui demande l'emplacement du fichier de sauvegarde.
3. Le document est sauvegardé dans ce fichier.

**Rechargement**

1. L'utilisateur appuie sur le bouton "Load".
2. Un dialogue s'ouvre et lui demande de chercher un fichier de sauvegarde.
3. Si c'est un fichier de sauvegarde valide, le document actuel est remplacé par le document dans le fichier.

### Cas 8. Sauvegarde de l'état du logiciel.
1. L'utilisateur rajoute et supprime des éléments de sa toolbar.
2. Il quitte le logiciel.
3. Lorsqu'il ré-ouvre le logiciel, la toolbar est telle qu'il l'avait laissée : ses formes peuvent être réutilisées dans de nouveaux whiteboards.
