# 1로 만들기

# 무조건 3으로 나누는 게 좋은게 아니란다
# N=int(input())
# cnt=0

# while(N!=1):
#     if N==2:
#         cnt+=1
#         N-=1
#     elif N%3==0:
#         cnt+=1
#         N/=3
#     elif N%3==2:
#         cnt+=1
#         N-=1
#         if N%2==0:
#             cnt+=1
#             N/=2
#         elif N%2==2:
#             cnt+=1
#             N-=1
#     elif N%3==1:
#         cnt+=1
#         N-=1

#     if N==1:
#         break

# print(cnt)

N = int(input())

dp = [0] * (N+1)

for i in range(2, N+1):
    dp[i] = dp[i-1] + 1
    if i % 3 == 0:
        dp[i] = min(dp[i], dp[i//3]+1)
    if i % 2 == 0:
        dp[i] = min(dp[i], dp[i//2]+1)
    
print(dp[N])