def solution(people, limit):
    people.sort()
    left = 0
    right = len(people) - 1
    answer = 0

    while left <= right:
        if left == right:
            answer += 1
            break
        if people[left] + people[right] <= limit:
            answer += 1
            right -= 1
            left += 1
        else:
            answer += 1
            right -= 1

    return answer


print(solution([70, 50, 80, 50], 100))
