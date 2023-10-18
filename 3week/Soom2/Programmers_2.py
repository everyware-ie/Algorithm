def solution(answers):
    length = len(answers)

    a = []
    b = []
    c = []
    acnt = 0
    bcnt = 0
    ccnt = 0

    for i in range(int(length / 5) + length % 5):
        a.extend([1, 2, 3, 4, 5])
    for i in range(int(length / 8) + length % 8):
        b.extend([2, 1, 2, 3, 2, 4, 2, 5])
    for i in range(int(length / 10) + length % 10):
        c.extend([3, 3, 1, 1, 2, 2, 4, 4, 5, 5])

    for i in range(length):
        if answers[i] == a[i]:
            acnt += 1
        if answers[i] == b[i]:
            bcnt += 1
        if answers[i] == c[i]:
            ccnt += 1

    if max(acnt, bcnt, ccnt) == acnt:
        if bcnt == acnt:
            if bcnt == acnt == ccnt:
                return [1, 2, 3]
            else:
                return [1, 2]
        elif ccnt == acnt:
            return [1, 3]
        else:
            return [1]
    elif max(acnt, bcnt, ccnt) == bcnt:
        if bcnt == ccnt:
            return [2, 3]
        else:
            return [2]
    else:
        return [3]


print(solution([1, 2, 3, 4, 5]))
