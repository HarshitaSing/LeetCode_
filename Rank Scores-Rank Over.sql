SELECT Score, dense_rank() OVER (order by Score DESC) AS `Rank`
FROM Scores;