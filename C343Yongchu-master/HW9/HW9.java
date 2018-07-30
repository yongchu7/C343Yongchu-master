/*
 question 1:
    a:  A B C D E F
      A     1   1
      B     1     1
      C 1 1   1   1
      D     1     1
      E 1         1
      F   1 1 1 1
    b: B [C,F]
       C [A,B,D,F]
       F [B,C,D,E]
       D [C,F]
       A [C,E]
       E [A,F]

    c: DFS: B -> C -> A -> E -> F -> D

    d: BFS: B -> C -> F -> A -> D -> E
 question 2:
    step 1: Do the DFS search for each vertex
    step 2: For each vertex, we can save the result in the list after we do the DFS
    step 3: The list for a vertex which cantains all the vertex in the DAG is the root of the DAG
    asymptotic complexity is n if there is n vertex in the graph
*/