N, M = map(int, input().split())

List = [list(map(int, input().split())) for _ in range(2)]

A = List[0]
B = List[1]

C = list(set(A).intersection(B))

A.extend(B)

A.sort()

print(*A)
