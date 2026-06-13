class Solution(object):
    def mapWordWeights(self, words, weights):
        result = []
        for word in words:
            total = 0
            for letter in word:
                idx = ord(letter) - ord('a')
                total += weights[idx]
            total = total % 26
            transformed_char = chr(ord('a') + 26 - total - 1)
            result.append(transformed_char)
        return ''.join(result)
