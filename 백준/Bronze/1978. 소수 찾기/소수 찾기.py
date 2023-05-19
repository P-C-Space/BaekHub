n = int(input()) # N개의 수

a = list(map(int,input().split()))
cnt = n
if(1 in a):
    cnt -= 1

for i in range(n):
    for j in range(2,a[i]):
        if(a[i]%j == 0):
            cnt -= 1
            break
print(cnt)