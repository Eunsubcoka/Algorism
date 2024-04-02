class Solution {
	public int solution(int[] bandage, int health, int[][] attacks) {
		int maxhp = health; // 최대 체력
		int hcnt = 0; // 연속 성공 체크
		int acnt = 0; // 공격 시간 인덱스
		int attacktime = attacks[attacks.length - 1][0]; // 마지막 공격 시간
		for (int i = 0; i <= attacktime; i++) {
			if (i == attacks[acnt][0]) { // 공격받았을 때
				health -= attacks[acnt][1];
				hcnt = 0;
				acnt++;
				if (health <= 0) { // 체력이 0이거나 그 이하면 -1 리턴
					return -1;
				}
            } 
            else if (health < maxhp) { // 최대 체력보다 낮을 때
				health += bandage[1];
				hcnt++;
				if (hcnt == bandage[0]) { // 시전 시간까지 연속 성공 했을 때 추가 회복
					health += bandage[2];
                    hcnt = 0;
				}
				if (health > maxhp) { // 체력이 최대 체력보다 높아지지 않게
					health = maxhp;
				}
			}
		}
		return health; // 남은 체력 리턴
	}
}