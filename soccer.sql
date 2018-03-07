CREATE TABLE Teams (
    TeamID SERIAL PRIMARY KEY,
    TeamName text,
    NumOfPlayers int
);

CREATE TABLE Players (
    PlayerID SERIAL PRIMARY KEY,
    FName text,
    LName text,
    TeamID Integer REFERENCES Teams(TeamID)
);

CREATE TABLE PlayerInfo(
    PlayerID Integer REFERENCES Players(PlayerID),
    Pos text,
    Age int,
    Nationality text
);

CREATE TABLE PlayerStatistics(
    PlayerID Integer REFERENCES Players(PlayerID),
    Goals int,
    Assist int,
    YCards int,
    RCards int
);

CREATE TABLE TeamStatistics(
    TeamID Integer REFERENCES Teams(TeamID),
    GamesPlayed int,
    Wins int,
    Draws int,
    Losses int
);

INSERT INTO Teams(TeamName, NumOfPlayers) VALUES ('Aguilas', 1);

INSERT INTO Players(FName, LName, TeamID) VALUES ('Oz', 'Qui', 1);

INSERT INTO PlayerInfo(PlayerID, Pos, Age, Nationality) VALUES (1, 'Def', 18, 'Mexico');

INSERT INTO PlayerStatistics(PlayerID, Goals, Assist, YCards, RCards) VALUES (1, 4, 5, 1, 0);

INSERT INTO TeamStatistics(TeamID, GamesPlayed, Wins, Draws, Losses) VALUES (1, 3, 2, 1, 0);