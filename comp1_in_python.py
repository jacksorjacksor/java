ciphertext = "ETEVHTWGSAHGWYVPNKQOEGWYVPNKPDEPHWAOVWPFWNHANEVWXAVOAEAJEUXTAOWBTEVHTWGSAHGWYVPNQAOQVGTYHAVAXETOANFQEOIQPLANTEVHFYNSQVEBEOWSKNCKLOPEVTYJAUFWYNCOTWZESQEPERQSQOPEVYCEVHEGDEHEVHEYOPNQEEHWYFTKTEVHTWGSAHGWYVPNKQOWVAPDEPWVTKFWNHANOTEVHTWGSAHGWYVPNQAOPDANAENAWVTKPIWHWYFTKTEVHTWGSAHGWYVPNQAOQVPDAIWNTHWVAWBPDAUQOYLFASQOPEVIDEPQOPDAWPDANWVA"
phrase = "NEPALSERBIASWITZERLANDBURKINAFASOKYRGYZSTANLUXEMBOURGSLOVAKIATAJIKISTANUGANDACHADANDAUSTRIA"
# Phrase doesn't have a Q, so the unidentified letter will be Q. This is in the ciphertext as "M"

# 1. List of all capital letters
list_of_capital_letters = [chr(i) for i in range(65, (65 + 26))]

# 2. Make list of indexes for N
list_of_indexes_of_n = []

for letter_index, letter in enumerate(phrase):
    if letter == "N":
        list_of_indexes_of_n.append(letter_index)

# 3. Go through and find if letters at such indexes are equal for N
for letter_index, current_letter in enumerate(ciphertext):
    is_correct = True
    for index in list_of_indexes_of_n:
        if (letter_index + index) >= len(ciphertext):
            is_correct = False
            break
        elif ciphertext[letter_index + index] != current_letter:
            is_correct = False
    if is_correct:
        index_of_phrase_start = letter_index

# 4. Make dictionary of letter replacements
phrase_letter_to_cipher_text_dict = {}

for phrase_letter_index, phrase_letter in enumerate(phrase):
    phrase_letter_to_cipher_text_dict[phrase_letter] = ciphertext[
        index_of_phrase_start + phrase_letter_index
    ]


# 5. Find the missing letter
missing_letter_from_phrase = set(list_of_capital_letters) - set(
    phrase_letter_to_cipher_text_dict.keys()
)

missing_letter_from_ciphertext = set(list_of_capital_letters) - set(
    phrase_letter_to_cipher_text_dict.values()
)

phrase_letter_to_cipher_text_dict[list(missing_letter_from_phrase)[0]] = list(
    missing_letter_from_ciphertext
)[0]

# Q isn't present, so if it doesn't appear then it's a Q!

eventual_outcome = ""

res_dict = dict((v, k) for k, v in phrase_letter_to_cipher_text_dict.items())

# 6. Run through list
for letter in ciphertext:
    eventual_outcome += res_dict[letter]

print(eventual_outcome)
