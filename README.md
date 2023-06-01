# Semestrální práce ALG2 - Ronald Ch. Siddall, AVI FM TUL
## Motivace projektu
Chtěl jsem svoji semestrální práci zaměřit na něco, co mi je velmi blízké a čemu se rád věnuji ve svém volném čase. Je to stolní tenis; poslední koníček a sport, který mi “přetrval” z dětství a kterému se mohu plně věnovat i nýnější době, během studia na univerzitě. 
Stolní tenis je velmi komplexní hra, která je běžným člověkem mnohdy nepochopená. Komplexnost hry je v mnoha směrech - psychika, technika, načasování, teorie potahů, dřev a míčků, různé typy úderů a mnoho dalších specifik, které z tohoto sportu činí celoživotní (a to doslova) zálibu a koníček!

Každopádně velkým problémem, na který jsem sám v průběhu hraní stolního tenisu narazil je, že není žádný jednoduchý způsob, jak zjistit, jak se mi může vyvíjet moje konkrétní bodové ohodnocení ELO podle toho, jestli vyhraju/prohraju proti určitému hráči.
Toto je hlavní myšlenka projektu a hlavní věc, kterou můj program řeší, ale o tom více níže.

## Popis problému
Na oficiálních stránkách STIS jsou dostupné žebříčky a soupisky všech dosavadních týmů a hráčů, kteří v ČR hrají. Žebříčky ve stolním tenise fungují na bázi hodnocení na principu ELO, což je způsob, jak se hodnotí výkonnost každého individuálního hráče - zjednodušeně hráč s vyšším ELO získá méně bodů, pokud porazí hráče s nižším ELO a hráč s nižším ELO ztratí méně bodů, když prohraje s hráčem, který má vyšší ELO.
Takhle to funguje i v opačném případě, kdy hráč s nižším ELO vyhraje proti hráči s vyšším ELO, tak získá mnohem víc bodů. Můj program pracuje s reálnými soupiskami všech týmů a jejich hráči v rámci dané soutěže.
Program by poté pracoval s žebříčky soutěže tzn. umístění všech hráčů podle zmiňovaného ELO hodnocení. Na základě informací z žebříčku by program dokázal spočítat, jak by se odvíjelo ELO obou hráčů, kdyby spolu teoreticky hráli zápas.
Program by znal jejich ELO (ze žebříčku) a podle toho by dokázal vyhodnotit, kolik ELO bodů by každý hráč získal/ztratil v případě výhry/prohry. Takto by se daly předpovídat ELO zisky/ztráty pro nadcházející soutěže a hráči by měli jednoduchý způsob, jak si tuto předpověď zjistit.

Mimo jiné program dokáže zobrazit informace konkrétního hráče, týmu, soutěžě aj., kromě toho umí zobrazit seřazené soupisky hráčů, týmů seřazených podle úspěšnosti, počtu bodů atd. a mnoho dalšího.

## Řešení problému a provedení projektu
### Funkční specifikace - popis fungování programu z pohledu uživatele
Uživatel má na výběr tyto metody a funkce. Jedná se o několika úrovňové menu, kterým může uživatel volně pohybovat pomocí kláves:

![MethodAndFunctionDiagramALG2_page-0001](https://github.com/TUL2223ALG/2223alg2-semestralproject-RonaldSiddall/assets/114618003/f32e178d-00e5-4a6f-b21b-a75af8c11341)

## Struktura vstupních a výstupních souborů
### Vstupní soubory - zdrojová data
Program pracuje s reálnými daty staženými z oficiální stránky českého stolního tenisu STIS. Tam jsou všechny žebříčky a informace k soutěžím, hráčům a týmům dostupné volně ke stažení ve formátu .csv, které jsou v otevírány v programu EXCEL. Program nedokáže pracovat s tímto souborem (v excelu), a proto je nutné, aby uživatel stažený soubor uložil v Excelu znovu, ale jako soubor CSV UTF-8 (s oddělovači) .csv.
Pokud se jedná o relevantní soubor a uživatel správně tento soubor uloží, tak program následně dokáže pracovat s libovolnými soutěžemi a žebříčky, které se v rámci STIS nachází.
### Výstupní soubory
Pokud uživatel zvolí volbu, že si chce uložit výsledky teoretického nasimulovaného zápasu do souboru, tak má na výběr ze dvou možností: buď do textového či binárního souboru. Oba tyto soubory poté obsahují kompletní teoretický rozbor konkrétního zápasu včetně informací o tom, co každá informace znamená.

## Class diagram (rozvržení tříd) projektu
Takto vypadá můj projekt rozvržený do tříd:
![ClassDiagramALG2_page-0001](https://github.com/TUL2223ALG/2223alg2-semestralproject-RonaldSiddall/assets/114618003/3cd9049b-df42-4248-a78e-24a4f68c9760)

## Testování a ukázka programu
### Ukázka zdrojového souboru:
![LeaderBoard](https://github.com/TUL2223ALG/2223alg2-semestralproject-RonaldSiddall/assets/114618003/46c70a64-2db4-4dbe-bd93-9d8a302c0730)
Nějak takto by poté program dokázal soubor zpracovat a zobrazit uživatelem chtěné informace např.:
### Zobrazení kompletního teoretického rozboru mezi dvěma hráči (zpracováno v textovém souboru):
![Simulation](https://github.com/TUL2223ALG/2223alg2-semestralproject-RonaldSiddall/assets/114618003/e535a40b-f5fa-4daf-bc72-2f89e3e1587d)
### Zobrazení žebříčku týmů seřazených podle bodů:
![SortedTeams](https://github.com/TUL2223ALG/2223alg2-semestralproject-RonaldSiddall/assets/114618003/061a5355-ce94-40d5-96f5-a9166f16df74)
### Zobrazení chybně zadaného jména (chybné parametry) uživatelem
![NonExistingNames](https://github.com/TUL2223ALG/2223alg2-semestralproject-RonaldSiddall/assets/114618003/13dd6889-32c7-4a82-b598-d606a4f21082)

## Externí knihovna
**javax.mail.jar**

Automatické posílání emailů dvojího typu:

    První případ: email s kompletním analytickým rozborem zápasu mezi dvěma libovolnými hráči v rámci dané soutěže
    Druhý případ: email s chybovou zprávou, pokud uživatel zadá, že chce zobrazit simulaci zápasu mezi hráči,
                  kteří neexistují (buď jeden nebo oba ) v dané tabulce soutěže (viz dále)

### Ukázka emailu:
![Emails](https://github.com/TUL2223ALG/2223alg2-semestralproject-RonaldSiddall/assets/114618003/159c3dfd-ead0-4481-83db-792faaf29299)

## TLDR
Program využívá reálných dat a statistik stolního tenisu z oficiální stránky STIS. 
Tato data zpracovává a následně je využívá k odhadu vývoje teoretického zápasu mezi dvěma hráči.
Tento rozbor zápasu si může uživatel zobrazit vícero způsoby (např. automatickým emailem).
Kromě toho program dokáže zobrazit další statistiky, informace a pracuje na základě více úrovňového menu, kterým se uživatel může pomocí kláves pohybovat
