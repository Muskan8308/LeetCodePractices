# Write your MySQL query statement below

DELETE P1 FROM Person P1, Person P2 
WHERE P1.EMAIL = P2.EMAIL AND P1.ID > P2.ID;