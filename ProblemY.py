m , n = map (int, input().split())
array = list (map (int, input().split()))
print (sum([2 if i > n else 1 for i in array ]))