m,n = map (int, input().split())
array = list(map(int,input().split()))
print(len([i for i in array if i>=array[n-1] and i>0]))