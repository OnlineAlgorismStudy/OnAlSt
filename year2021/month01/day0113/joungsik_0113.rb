def solution(prices)
    answer = prices.each_with_index.map do |price, index|
        sum = 0
        prices.drop(index + 1).each do |n|
            if price <= n
                sum += 1
            else
                sum += 1
                break
            end
        end

        sum
    end
    
    return answer
end