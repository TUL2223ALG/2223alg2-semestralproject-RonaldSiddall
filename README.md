# Semestral project for ALG2 - Ronald Ch. Siddall, AVI FM TUL
## Project Motivation (scroll down for a TLDR of the project)
I wanted to focus my semester project on something that is very close to my heart and that I like to do in my spare time. It is table tennis; the last hobby and sport that has "survived" since my childhood and to which I can still fully devote myself while studying at university. 
Table tennis is a very complex game that is often misunderstood by the average person. The complexity of the game is in many ways - mentality, technique, timing, theory of covers, woods and balls, different types of strikes and many other specifics that make this sport a lifelong (quite literally) passion and hobby!

Anyway, a big problem I've run into myself in the course of playing table tennis is that there is no easy way to figure out how my specific ELO score might evolve based on whether I win/lose against a specific player.
This was the main idea behind the project and the main thing my program addresses, but more on that below.

## Problem description
On the official STIS website, there are rankings and rosters of all teams and players who are playing or have played in the Czech Republic. Ranking in table tennis works on the basis of ELO points, which is how the performance of each individual player is evaluated - in simple terms, a player with a higher ELO gets fewer points if he beats a player with a lower ELO, and a player with a lower ELO loses fewer points if he loses to a player with a higher ELO.
It works the other way around too, where if the player with the lower ELO wins against the player with the higher ELO, they get a lot more points. My program works with real rosters of all teams and their players within a given competition.
The program operates with the rankings of the competition i.e. the placement of all players according to the mentioned ELO rating. Based on the information from the rankings, the program is able to calculate how the ELO of both players would unfold if they were to theoretically play a match together.
The program would know their ELOs (from the rankings) and from that it is able to evaluate how many ELO points each player would gain/lose in case of a win/loss. This way, ELO gains/losses could be predicted for upcoming competitions and players would have an easy way to find out this prediction.

Among other things, the program can display information of a specific player, team, competition, etc., in addition to being able to display ranked rosters of players, teams ranked by success rate, points, etc., and much more.

## Problem solution and project execution
### Functional specification - description of the program from the user's point of view
The user has the following methods and functions to choose from. It is a multi-level menu that the user can move through freely using keyboard keys:

![MethodAndFunctionDiagramALG2_page-0001](https://github.com/TUL2223ALG/2223alg2-semestralproject-RonaldSiddall/assets/114618003/f32e178d-00e5-4a6f-b21b-a75af8c11341)

## Structure of input and output files
### Input files - source data
The program works with real life data downloaded from the official Czech Republic table tennis website STIS (https://stis.ping-pong.cz/). There, all rankings and information about competitions, players and teams are freely available to download in .csv format, which can be opened in EXCEL. The program cannot work with this file (in Excel) though, so the user must save the downloaded file in Excel again, but as a CSV UTF-8 (with separators) .csv file.
If it is a relevant file and the user has saved this file correctly, the program can then work with any competitions and leaderboards that are within STIS.
### Output files
If the user chooses to save the results of a theoretically simulated match to a file, he has two choices: either a text or a binary file. Both of these files then contain a complete theoretical analysis of the specific match, including the description about what all of the information means.

## Class diagram of the project
This is what my project looks like laid out in classes or in other words a class diagram:
![ClassDiagramALG2_page-0001](https://github.com/TUL2223ALG/2223alg2-semestralproject-RonaldSiddall/assets/114618003/3cd9049b-df42-4248-a78e-24a4f68c9760)

## Testing and demonstration of the program
### Sample source file:
![LeaderBoard](https://github.com/TUL2223ALG/2223alg2-semestralproject-RonaldSiddall/assets/114618003/46c70a64-2db4-4dbe-bd93-9d8a302c0730)
This is an example of how the program is able to process the file and display the information desired by the user, for example:
### Displaying the complete theoretical analysis between two players (processed in a text file):
![Simulation](https://github.com/TUL2223ALG/2223alg2-semestralproject-RonaldSiddall/assets/114618003/e535a40b-f5fa-4daf-bc72-2f89e3e1587d)
### View the ranking of teams sorted by points:
![SortedTeams](https://github.com/TUL2223ALG/2223alg2-semestralproject-RonaldSiddall/assets/114618003/061a5355-ce94-40d5-96f5-a9166f16df74)
### Display of incorrectly entered name (wrong parameters) by the user
![NonExistingNames](https://github.com/TUL2223ALG/2223alg2-semestralproject-RonaldSiddall/assets/114618003/13dd6889-32c7-4a82-b598-d606a4f21082)

## External library
**javax.mail.jar**

Automatically send emails of two types:

    First type: an email with a complete analytical analysis of a match between any two players in a given competition.
    Second type: an email with an error message if the user specifies that they want to view a simulation of a match between players,
                  who do not exist (either one of the players or both of them) in the given competition table (see below)

### Sample email:
![Emails](https://github.com/TUL2223ALG/2223alg2-semestralproject-RonaldSiddall/assets/114618003/159c3dfd-ead0-4481-83db-792faaf29299)

## TLDR
The program uses real table tennis data and statistics from the official STIS website. 
It processes this data and then uses it to estimate the outcome of a theoretical match between two players.
This match analysis can be viewed by the user in several ways (e.g. by automatic email).
In addition, the program can display other statistics, information and works on the basis of a multi-level menu, which the user can navigate through using the keys on his keyboard
