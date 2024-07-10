# partielSC

## 1. Forkez ce repo ou suivez son exemple de format dans un repo que vous devez me partager à l'adresse remi.hamy@gmail.com
## Format du nom de repo PartielSoftwareCraftmanship"< Votre NOM PRENOM >"

## 2. Partie questions
Veuillez copier les questions et y répondre dans ce README pour les questions textes.
Pour les autres questions, mettez votre code dans le dossier CODE à la racine de votre repo

2. Qu’est ce que du code propre ?

Un code propre doit respecter les principes SOLID:
- single responsability: une classe ne doit avoir qu'une raison de changer
- open closed: une classe doit être ouverte à l'extension mais fermée à la modification pour éviter de devoir revenir sur du code déjà fait et d'y introduire des bugs
- Liskov substitution: il vaut mieux parfois qu'un type A et une type B héritent d'un type C plutôt que A hérite de B ou l'inverse
- interface segregation: éviter les contrats trop lourds et trop durs à respecter, préférer les découper et les réunir par la suite si beosin dans d'autres interfaces
- dependency inversion: établir une dépendance entre une classe A et une interface puis entre une classe B et cette même interface plutôt que de faire déprendre les classes l'une de l'autre directement. Le but étant de pouvoir altérer une classe sans casser le fonctionnement de l'autre, on rajoute une couche d'abstraction entre les deux

4. Aie aie aie, l’équipe a reçu un nouveau cket méer pour notre
geson des achats durant vos congés, évidemment, ils ont du chiffrer
tout ça et réduire le temps inialement demandé. Vous rentrez donc
de congés et voyez un cket :

La disponilbité des articles devrait être implémentée dans la classe Order.
L'enregistrement devrait se faire dans la classe OrderRepository
Le fait que le mail ait son propre service est une bonne chose
