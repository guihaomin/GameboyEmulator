package gbaEmu;

public class Opcodes {
	CPU cpu;
	Memory memory;
	public int OP7F() {
		cpu.register.a = cpu.register.a;
		return 0;
	}
	public int OP78() {
		cpu.register.a = cpu.register.b;
		return 0;
	}
	public int OP79() {
		cpu.register.a = cpu.register.c;
		return 0;
	}
	public int OP7A() {
		cpu.register.a = cpu.register.d;
		return 0;
	}
	public int OP7B() {
		cpu.register.a = cpu.register.e;
		return 0;
	}
	public int OP7C() {
		cpu.register.a = cpu.register.h;
		return 0;
	}
	public int OP7D() {
		cpu.register.a = cpu.register.l;
		return 0;
	}
	public int OP7E() {
		cpu.register.a = memory.readMemory(cpu.register.hl());
		return 0;
	}
	public int OP40() {
		cpu.register.b = cpu.register.b;
		return 0;
	}
	public int OP41() {
		cpu.register.b = cpu.register.c;
		return 0;
	}
	public int OP42() {
		cpu.register.b = cpu.register.d;
		return 0;
	}
	public int OP43() {
		cpu.register.b = cpu.register.e;
		return 0;
	}
	public int OP44() {
		cpu.register.b = cpu.register.h;
		return 0;
	}
	public int OP45() {
		cpu.register.b = cpu.register.l;
		return 0;
	}
	public int OP46() {
		cpu.register.b = memory.readMemory(cpu.register.hl());
		return 0;
	}
	public int OP48() {
		cpu.register.c = cpu.register.b;
		return 0;
	}
	public int OP49() {
		cpu.register.c = cpu.register.c;
		return 0;
	}
	public int OP4A() {
		cpu.register.c = cpu.register.d;
		return 0;
	}
	public int OP4B() {
		cpu.register.c = cpu.register.e;
		return 0;
	}
	public int OP4C() {
		cpu.register.c = cpu.register.h;
		return 0;
	}
	public int OP4D() {
		cpu.register.c = cpu.register.l;
		return 0;
	}
	public int OP4E() {
		cpu.register.c = memory.readMemory(cpu.register.hl());
		return 0;
	}
	public int OP50() {
		cpu.register.d = cpu.register.b;
		return 0;
	}
	public int OP51() {
		cpu.register.d = cpu.register.c;
		return 0;
	}
	public int OP52() {
		cpu.register.d = cpu.register.d;
		return 0;
	}
	public int OP53() {
		cpu.register.d = cpu.register.e;
		return 0;
	}
	public int OP54() {
		cpu.register.d = cpu.register.h;
		return 0;
	}
	public int OP55() {
		cpu.register.d = cpu.register.l;
		return 0;
	}
	public int OP56() {
		cpu.register.d = memory.readMemory(cpu.register.hl());
		return 0;
	}
	public int OP58() {
		cpu.register.e = cpu.register.b;
		return 0;
	}
	public int OP59() {
		cpu.register.e = cpu.register.c;
		return 0;
	}
	public int OP5A() {
		cpu.register.e = cpu.register.d;
		return 0;
	}
	public int OP5B() {
		cpu.register.e = cpu.register.e;
		return 0;
	}
	public int OP5C() {
		cpu.register.e = cpu.register.h;
		return 0;
	}
	public int OP5D() {
		cpu.register.e = cpu.register.l;
		return 0;
	}
	public int OP5E() {
		cpu.register.e = memory.readMemory(cpu.register.hl());
		return 0;
	}
	public int OP60() {
		cpu.register.h = cpu.register.b;
		return 0;
	}
	public int OP61() {
		cpu.register.h = cpu.register.c;
		return 0;
	}
	public int OP62() {
		cpu.register.h = cpu.register.d;
		return 0;
	}
	public int OP63() {
		cpu.register.h = cpu.register.e;
		return 0;
	}
	public int OP64() {
		cpu.register.h = cpu.register.h;
		return 0;
	}
	public int OP65() {
		cpu.register.h = cpu.register.l;
		return 0;
	}
	public int OP66() {
		cpu.register.h = memory.readMemory(cpu.register.hl());
		return 0;
	}
	public int OP68() {
		cpu.register.l = cpu.register.b;
		return 0;
	}
	public int OP69() {
		cpu.register.l = cpu.register.c;
		return 0;
	}
	public int OP6A() {
		cpu.register.l = cpu.register.d;
		return 0;
	}
	public int OP6B() {
		cpu.register.l = cpu.register.e;
		return 0;
	}
	public int OP6C() {
		cpu.register.l = cpu.register.h;
		return 0;
	}
	public int OP6D() {
		cpu.register.l = cpu.register.l;
		return 0;
	}
	public int OP6E() {
		cpu.register.l = memory.readMemory(cpu.register.hl());
		return 0;
	}
	public int OP70() {
		memory.writeMemory(cpu.register.hl(), (byte) cpu.register.b);
		return 0;
	}
	public int OP71() {
		memory.writeMemory(cpu.register.hl(), (byte) cpu.register.c);
		return 0;
	}
	public int OP72() {
		memory.writeMemory(cpu.register.hl(), (byte) cpu.register.d);
		return 0;
	}
	public int OP73() {
		memory.writeMemory(cpu.register.hl(), (byte) cpu.register.e);
		return 0;
	}
	public int OP74() {
		memory.writeMemory(cpu.register.hl(), (byte) cpu.register.h);
		return 0;
	}
	public int OP75() {
		memory.writeMemory(cpu.register.hl(), (byte) cpu.register.l);
		return 0;
	}
	public int OP36() {
		memory.writeMemory(cpu.register.hl(), cpu.getValue8());
		return 0;
	}
	public int OP06() {
		cpu.register.b = cpu.getValue8();
		return 0;
	}
	public int OP0E() {
		cpu.register.c = cpu.getValue8();
		return 0;
	}
	public int OP16() {
		cpu.register.d = cpu.getValue8();
		return 0;
	}
	public int OP1E() {
		cpu.register.e = cpu.getValue8();
		return 0;
	}
	public int OP26() {
		cpu.register.h = cpu.getValue8();
		return 0;
	}
	public int OP2E() {
		cpu.register.l = cpu.getValue8();
		return 0;
	}
	public int OP0A() {
		cpu.register.a = memory.readMemory(cpu.register.bc());
		return 0;
	}
	public int OP1A() {
		cpu.register.a = memory.readMemory(cpu.register.de());
		return 0;
	}
	public int OPFA() {
		cpu.register.a = memory.readMemory(cpu.getValue16());
		return 0;
	}
	public int OP3E() {
		cpu.register.a = cpu.getValue8();
		return 0;
	}
	public int OP47() {
		cpu.register.b = cpu.register.a;
		return 0;
	}
	public int OP4F() {
		cpu.register.c = cpu.register.a;
		return 0;
	}
	public int OP57() {
		cpu.register.d = cpu.register.a;
		return 0;
	}
	public int OP5F() {
		cpu.register.e = cpu.register.a;
		return 0;
	}
	public int OP67() {
		cpu.register.h = cpu.register.a;
		return 0;
	}
	public int OP6F() {
		cpu.register.l = cpu.register.a;
		return 0;
	}
	public int OP02() {
		memory.writeMemory(cpu.register.bc(), (byte) cpu.register.a);
		return 0;
	}
	public int OP12() {
		memory.writeMemory(cpu.register.de(), (byte) cpu.register.a);
		return 0;
	}
	public int OP77() {
		memory.writeMemory(cpu.register.hl(), (byte) cpu.register.a);
		return 0;
	}
	public int OPEA() {
		memory.writeMemory(cpu.getValue16(), (byte) cpu.register.a);
		return 0;
	}
	public int OPF2() {
		cpu.register.a = memory.readMemory(0xFF00 + cpu.register.c);
		return 0;
	}
	public int OPE2() {
		memory.writeMemory(0xFF00 + cpu.register.c, (byte) cpu.register.a);
		return 0;
	}
	public int OP3A() {
		cpu.register.a = memory.readMemory(cpu.register.hl());
		cpu.decrementHL();
		return 0;
	}
	public int OP32() {
		memory.writeMemory(cpu.register.hl(), (byte) cpu.register.a);
		cpu.decrementHL();
		return 0;
	}
	public int OP2A() {
		cpu.register.a = memory.readMemory(cpu.register.hl());
		cpu.incrementHL();
		return 0;
	}
	public int OP22() {
		memory.writeMemory(cpu.register.hl(), (byte) cpu.register.a);
		cpu.incrementHL();
		return 0;
	}
	public int OPE0() {
		memory.writeMemory(0xFF00 + cpu.getValue8(), (byte) cpu.register.a);
		return 0;
	}
	public int OPF0() {
		cpu.register.a = memory.readMemory(0xFF00 + cpu.getValue8());
		return 0;
	}
	public int OP01() {
		int nn = cpu.getValue16();
		cpu.putBC(nn);
		return 0;
	}
	public int OP11() {
		int nn = cpu.getValue16();
		cpu.putDE(nn);
		return 0;
	}
	public int OP21() {
		int nn = cpu.getValue16();
		cpu.putHL(nn);
		return 0;
	}
	public int OP31() {
		int nn = cpu.getValue16();
		cpu.putSP(nn);
		return 0;
	}
	public int OPF9() {
		cpu.register.sp = (short) cpu.register.hl();
		return 0;
	}
	public int OPF8() {
		int n = cpu.getValue8();
		int intermidiateValue = cpu.register.sp + n;
		cpu.register.zf = false;
		cpu.register.nf = false;
		if (n >= 0) {
			cpu.register.cf = ((cpu.register.sp & 255) + n) > 255;
			cpu.register.hf = ((cpu.register.sp & 16) + (n & 16)) > 16;
		} else {
			cpu.register.cf = ((cpu.register.sp & 255) + ((256 + n) & 255)) > 255;
			cpu.register.hf = ((cpu.register.sp & 16) + ((256 + n) & 16)) > 16;
		}
		cpu.putHL(0xFFFF & intermidiateValue);
		return 0;
	}
	public int OP08() {
		cpu.putSP(cpu.getValue16());
		return 0;
	}
	public int OPF5() {
		memory.stackPush(cpu.register.af());
		return 0;
	}
	public int OPC5() {
		memory.stackPush(cpu.register.bc());
		return 0;
	}
	public int OPD5() {
		memory.stackPush(cpu.register.de());
		return 0;
	}
	public int OPE5() {
		memory.stackPush(cpu.register.hl());
		return 0;
	}
	public int OPF1() {
		cpu.putAF(memory.stackPop());
		return 0;
	}
	public int OPC1() {
		cpu.putBC(memory.stackPop());
		return 0;
	}
	public int OPD1() {
		cpu.putDE(memory.stackPop());
		return 0;
	}
	public int OPE1() {
		cpu.putHL(memory.stackPop());
		return 0;
	}
	public int OP87() {
		int intermediateResult = cpu.register.a + cpu.register.a;
		cpu.register.zf = intermediateResult == 0;
		cpu.register.nf = false;
		cpu.register.cf = (cpu.register.a & 0xFF) + (cpu.register.a & 0xFF) > 0xFF;
		cpu.register.hf = (cpu.register.a & 0xF) + (cpu.register.a & 0xF) > 0xF;
		cpu.register.a = (byte) (intermediateResult & 0xFF);
		return 0;
	}
	public int OP80() {
		int intermediateResult = cpu.register.a + cpu.register.b;
		cpu.register.zf = intermediateResult == 0;
		cpu.register.nf = false;
		cpu.register.cf = (cpu.register.a & 0xFF) + (cpu.register.b & 0xFF) > 0xFF;
		cpu.register.hf = (cpu.register.a & 0xF) + (cpu.register.b & 0xF) > 0xF;
		cpu.register.a = (byte) (intermediateResult & 0xFF);
		return 0;
	}
	public int OP81() {
		int intermediateResult = cpu.register.a + cpu.register.c;
		cpu.register.zf = intermediateResult == 0;
		cpu.register.nf = false;
		cpu.register.cf = (cpu.register.a & 0xFF) + (cpu.register.c & 0xFF) > 0xFF;
		cpu.register.hf = (cpu.register.a & 0xF) + (cpu.register.c & 0xF) > 0xF;
		cpu.register.a = (byte) (intermediateResult & 0xFF);
		return 0;
	}
	public int OP82() {
		int intermediateResult = cpu.register.a + cpu.register.d;
		cpu.register.zf = intermediateResult == 0;
		cpu.register.nf = false;
		cpu.register.cf = (cpu.register.a & 0xFF) + (cpu.register.d & 0xFF) > 0xFF;
		cpu.register.hf = (cpu.register.a & 0xF) + (cpu.register.d & 0xF) > 0xF;
		cpu.register.a = (byte) (intermediateResult & 0xFF);
		return 0;
	}
	public int OP83() {
		int intermediateResult = cpu.register.a + cpu.register.e;
		cpu.register.zf = intermediateResult == 0;
		cpu.register.nf = false;
		cpu.register.cf = (cpu.register.a & 0xFF) + (cpu.register.e & 0xFF) > 0xFF;
		cpu.register.hf = (cpu.register.a & 0xF) + (cpu.register.e & 0xF) > 0xF;
		cpu.register.a = (byte) (intermediateResult & 0xFF);
		return 0;
	}
	public int OP84() {
		int intermediateResult = cpu.register.a + cpu.register.h;
		cpu.register.zf = intermediateResult == 0;
		cpu.register.nf = false;
		cpu.register.cf = (cpu.register.a & 0xFF) + (cpu.register.h & 0xFF) > 0xFF;
		cpu.register.hf = (cpu.register.a & 0xF) + (cpu.register.h & 0xF) > 0xF;
		cpu.register.a = (byte) (intermediateResult & 0xFF);
		return 0;
	}
	public int OP85() {
		int intermediateResult = cpu.register.a + cpu.register.l;
		cpu.register.zf = intermediateResult == 0;
		cpu.register.nf = false;
		cpu.register.cf = (cpu.register.a & 0xFF) + (cpu.register.l & 0xFF) > 0xFF;
		cpu.register.hf = (cpu.register.a & 0xF) + (cpu.register.l & 0xF) > 0xF;
		cpu.register.a = (byte) (intermediateResult & 0xFF);
		return 0;
	}
	public int OP86() {
		byte n = memory.readMemory(cpu.register.hl());
		int intermediateResult = cpu.register.a + n;
		cpu.register.zf = intermediateResult == 0;
		cpu.register.nf = false;
		cpu.register.cf = (cpu.register.a & 0xFF) + (n & 0xFF) > 0xFF;
		cpu.register.hf = (cpu.register.a & 0xF) + (n & 0xF) > 0xF;
		cpu.register.a = (byte) (intermediateResult & 0xFF);
		return 0;
	}
	public int OPC6() {
		byte n = cpu.getValue8();
		int intermediateResult = cpu.register.a + n;
		cpu.register.zf = intermediateResult == 0;
		cpu.register.nf = false;
		cpu.register.cf = (cpu.register.a & 0xFF) + (n & 0xFF) > 0xFF;
		cpu.register.hf = (cpu.register.a & 0xF) + (n & 0xF) > 0xF;
		cpu.register.a = (byte) (intermediateResult & 0xFF);
		return 0;
	}
	public int OP8F() {
		int carryFlag = 0;
		if (cpu.register.cf) {
			carryFlag = 1;
		}
		int intermediateResult = cpu.register.a + cpu.register.a + carryFlag;
		cpu.register.zf = intermediateResult == 0;
		cpu.register.nf = false;
		cpu.register.cf = (cpu.register.a & 0xFF) + (cpu.register.a & 0xFF) + carryFlag > 0xFF;
		cpu.register.hf = (cpu.register.a & 0xF) + (cpu.register.a & 0xF) + carryFlag > 0xF;
		cpu.register.a = (byte) (intermediateResult & 0xFF);
		return 0;
	}
	public int OP88() {
		int carryFlag = 0;
		if (cpu.register.cf) {
			carryFlag = 1;
		}
		int intermediateResult = cpu.register.a + cpu.register.b + carryFlag;
		cpu.register.zf = intermediateResult == 0;
		cpu.register.nf = false;
		cpu.register.cf = (cpu.register.a & 0xFF) + (cpu.register.b & 0xFF) + carryFlag > 0xFF;
		cpu.register.hf = (cpu.register.a & 0xF) + (cpu.register.b & 0xF) + carryFlag > 0xF;
		cpu.register.a = (byte) (intermediateResult & 0xFF);
		return 0;
	}
	public int OP89() {
		int carryFlag = 0;
		if (cpu.register.cf) {
			carryFlag = 1;
		}
		int intermediateResult = cpu.register.a + cpu.register.c + carryFlag;
		cpu.register.zf = intermediateResult == 0;
		cpu.register.nf = false;
		cpu.register.cf = (cpu.register.a & 0xFF) + (cpu.register.c & 0xFF) + carryFlag > 0xFF;
		cpu.register.hf = (cpu.register.a & 0xF) + (cpu.register.c & 0xF) + carryFlag > 0xF;
		cpu.register.a = (byte) (intermediateResult & 0xFF);
		return 0;
	}
	public int OP8A() {
		int carryFlag = 0;
		if (cpu.register.cf) {
			carryFlag = 1;
		}
		int intermediateResult = cpu.register.a + cpu.register.d + carryFlag;
		cpu.register.zf = intermediateResult == 0;
		cpu.register.nf = false;
		cpu.register.cf = (cpu.register.a & 0xFF) + (cpu.register.d & 0xFF) + carryFlag > 0xFF;
		cpu.register.hf = (cpu.register.a & 0xF) + (cpu.register.d & 0xF) + carryFlag > 0xF;
		cpu.register.a = (byte) (intermediateResult & 0xFF);
		return 0;
	}
	public int OP8B() {
		int carryFlag = 0;
		if (cpu.register.cf) {
			carryFlag = 1;
		}
		int intermediateResult = cpu.register.a + cpu.register.e + carryFlag;
		cpu.register.zf = intermediateResult == 0;
		cpu.register.nf = false;
		cpu.register.cf = (cpu.register.a & 0xFF) + (cpu.register.e & 0xFF) + carryFlag > 0xFF;
		cpu.register.hf = (cpu.register.a & 0xF) + (cpu.register.e & 0xF) + carryFlag > 0xF;
		cpu.register.a = (byte) (intermediateResult & 0xFF);
		return 0;
	}
	public int OP8C() {
		int carryFlag = 0;
		if (cpu.register.cf) {
			carryFlag = 1;
		}
		int intermediateResult = cpu.register.a + cpu.register.h + carryFlag;
		cpu.register.zf = intermediateResult == 0;
		cpu.register.nf = false;
		cpu.register.cf = (cpu.register.a & 0xFF) + (cpu.register.h & 0xFF) + carryFlag > 0xFF;
		cpu.register.hf = (cpu.register.a & 0xF) + (cpu.register.h & 0xF) + carryFlag > 0xF;
		cpu.register.a = (byte) (intermediateResult & 0xFF);
		return 0;
	}
	public int OP8D() {
		int carryFlag = 0;
		if (cpu.register.cf) {
			carryFlag = 1;
		}
		int intermediateResult = cpu.register.a + cpu.register.l + carryFlag;
		cpu.register.zf = intermediateResult == 0;
		cpu.register.nf = false;
		cpu.register.cf = (cpu.register.a & 0xFF) + (cpu.register.l & 0xFF) + carryFlag > 0xFF;
		cpu.register.hf = (cpu.register.a & 0xF) + (cpu.register.l & 0xF) + carryFlag > 0xF;
		cpu.register.a = (byte) (intermediateResult & 0xFF);
		return 0;
	}
	public int OP8E() {
		int carryFlag = 0;
		if (cpu.register.cf) {
			carryFlag = 1;
		}
		byte n = memory.readMemory(cpu.register.hl());
		int intermediateResult = cpu.register.a + n + carryFlag;
		cpu.register.zf = intermediateResult == 0;
		cpu.register.nf = false;
		cpu.register.cf = (cpu.register.a & 0xFF) + (n & 0xFF) + carryFlag > 0xFF;
		cpu.register.hf = (cpu.register.a & 0xF) + (n & 0xF) + carryFlag > 0xF;
		cpu.register.a = (byte) (intermediateResult & 0xFF);
		return 0;
	}
	public int OPCE() {
		int carryFlag = 0;
		if (cpu.register.cf) {
			carryFlag = 1;
		}
		byte n = cpu.getValue8();
		int intermediateResult = cpu.register.a + n + carryFlag;
		cpu.register.zf = intermediateResult == 0;
		cpu.register.nf = false;
		cpu.register.cf = (cpu.register.a & 0xFF) + (n & 0xFF) + carryFlag > 0xFF;
		cpu.register.hf = (cpu.register.a & 0xF) + (n & 0xF) + carryFlag > 0xF;
		cpu.register.a = (byte) (intermediateResult & 0xFF);
		return 0;
	}
	public int setSubFlags(int a, int n) {
		int intermediateResult = a - n;
		cpu.register.nf = true;
		cpu.register.zf = intermediateResult == 0;
		cpu.register.cf = intermediateResult < 0;
		cpu.register.hf = (cpu.register.a & 0xF) < (cpu.register.a & 0xF);
		return 0;
	}
	public int OP97() {
		int intermediateResult = cpu.register.a - cpu.register.a;
		this.setSubFlags(cpu.register.a, cpu.register.a);
		cpu.register.a = (byte) (intermediateResult & 0xFF);
		return 0;
	}
	public int OP90() {
		int intermediateResult = cpu.register.a - cpu.register.b;
		this.setSubFlags(cpu.register.a, cpu.register.b);
		cpu.register.a = (byte) (intermediateResult & 0xFF);
		return 0;
	}
	public int OP91() {
		int intermediateResult = cpu.register.a - cpu.register.c;
		this.setSubFlags(cpu.register.a, cpu.register.c);
		cpu.register.a = (byte) (intermediateResult & 0xFF);
		return 0;
	}
	public int OP92() {
		int intermediateResult = cpu.register.a - cpu.register.d;
		this.setSubFlags(cpu.register.a, cpu.register.d);
		cpu.register.a = (byte) (intermediateResult & 0xFF);
		return 0;
	}
	public int OP93() {
		int intermediateResult = cpu.register.a - cpu.register.e;
		this.setSubFlags(cpu.register.a, cpu.register.e);
		cpu.register.a = (byte) (intermediateResult & 0xFF);
		return 0;
	}
	public int OP94() {
		int intermediateResult = cpu.register.a - cpu.register.h;
		this.setSubFlags(cpu.register.a, cpu.register.h);
		cpu.register.a = (byte) (intermediateResult & 0xFF);
		return 0;
	}
	public int OP95() {
		int intermediateResult = cpu.register.a - cpu.register.l;
		this.setSubFlags(cpu.register.a, cpu.register.l);
		cpu.register.a = (byte) (intermediateResult & 0xFF);
		return 0;
	}
	public int OP96() {
		byte n = memory.readMemory(cpu.register.hl());
		int intermediateResult = cpu.register.a - n;
		this.setSubFlags(cpu.register.a, n);
		cpu.register.a = (byte) (intermediateResult & 0xFF);
		return 0;
	}
	public int OPD6() {
		byte n = cpu.getValue8();
		int intermediateResult = cpu.register.a - n;
		this.setSubFlags(cpu.register.a, n);
		cpu.register.a = (byte) (intermediateResult & 0xFF);
		return 0;
	}
	public int OP9F() {
		int intermediateResult = cpu.register.a - cpu.register.a - 1;
		this.setSubFlags(cpu.register.a, cpu.register.a + 1);
		cpu.register.a = (byte) (intermediateResult & 0xFF);
		return 0;
	}
	public int OP98() {
		int intermediateResult = cpu.register.a - cpu.register.b - 1;
		this.setSubFlags(cpu.register.a, cpu.register.b + 1);
		cpu.register.a = (byte) (intermediateResult & 0xFF);
		return 0;
	}
	public int OP99() {
		int intermediateResult = cpu.register.a - cpu.register.c - 1;
		this.setSubFlags(cpu.register.a, cpu.register.c + 1);
		cpu.register.a = (byte) (intermediateResult & 0xFF);
		return 0;
	}
	public int OP9A() {
		int intermediateResult = cpu.register.a - cpu.register.d - 1;
		this.setSubFlags(cpu.register.a, cpu.register.d + 1);
		cpu.register.a = (byte) (intermediateResult & 0xFF);
		return 0;
	}
	public int OP9B() {
		int intermediateResult = cpu.register.a - cpu.register.e - 1;
		this.setSubFlags(cpu.register.a, cpu.register.e + 1);
		cpu.register.a = (byte) (intermediateResult & 0xFF);
		return 0;
	}
	public int OP9C() {
		int intermediateResult = cpu.register.a - cpu.register.h - 1;
		this.setSubFlags(cpu.register.a, cpu.register.h + 1);
		cpu.register.a = (byte) (intermediateResult & 0xFF);
		return 0;
	}
	public int OP9D() {
		int intermediateResult = cpu.register.a - cpu.register.l - 1;
		this.setSubFlags(cpu.register.a, cpu.register.l + 1);
		cpu.register.a = (byte) (intermediateResult & 0xFF);
		return 0;
	}
	public int OP9E() {
		byte n = memory.readMemory(cpu.register.hl());
		int intermediateResult = cpu.register.a - n - 1;
		this.setSubFlags(cpu.register.a, n + 1);
		cpu.register.a = (byte) (intermediateResult & 0xFF);
		return 0;
	}
	public int OPDE() {
		byte n = cpu.getValue8();
		int intermediateResult = cpu.register.a - n - 1;
		this.setSubFlags(cpu.register.a, n + 1);
		cpu.register.a = (byte) (intermediateResult & 0xFF);
		return 0;
	}
	private int setAndFlags(byte a, byte b) {
		int result = a & b;
		cpu.register.zf = result == 0;
		cpu.register.nf = false;
		cpu.register.hf = true;
		cpu.register.cf = false;
		return 0;
	}
	public int OPA7() {
		setAndFlags(cpu.register.a, cpu.register.a);
		cpu.register.a = (byte) (cpu.register.a & cpu.register.a);
		return 0;
	}
	public int OPA0() {
		setAndFlags(cpu.register.a, cpu.register.b);
		cpu.register.a = (byte) (cpu.register.a & cpu.register.b);
		return 0;
	}
	public int OPA1() {
		setAndFlags(cpu.register.a, cpu.register.c);
		cpu.register.a = (byte) (cpu.register.a & cpu.register.c);
		return 0;
	}
	public int OPA2() {
		setAndFlags(cpu.register.a, cpu.register.d);
		cpu.register.a = (byte) (cpu.register.a & cpu.register.d);
		return 0;
	}
	public int OPA3() {
		setAndFlags(cpu.register.a, cpu.register.e);
		cpu.register.a = (byte) (cpu.register.a & cpu.register.e);
		return 0;
	}
	public int OPA4() {
		setAndFlags(cpu.register.a, cpu.register.h);
		cpu.register.a = (byte) (cpu.register.a & cpu.register.h);
		return 0;
	}
	public int OPA5() {
		setAndFlags(cpu.register.a, cpu.register.l);
		cpu.register.a = (byte) (cpu.register.a & cpu.register.l);
		return 0;
	}
	public int OPA6() {
		byte n = memory.readMemory(cpu.register.hl());
		setAndFlags(cpu.register.a, n);
		cpu.register.a = (byte) (cpu.register.a & n);
		return 0;
	}
	public int OPE6() {
		byte n = cpu.getValue8();
		setAndFlags(cpu.register.a, n);
		cpu.register.a = (byte) (cpu.register.a & n);
		return 0;
	}
	private int setOrFlags(byte a, byte b) {
		int result = a | b;
		cpu.register.zf = result == 0;
		cpu.register.nf = false;
		cpu.register.hf = false;
		cpu.register.cf = false;
		return 0;
	}
	public int OPB7() {
		setOrFlags(cpu.register.a, cpu.register.a);
		cpu.register.a = (byte) (cpu.register.a | cpu.register.a);
		return 0;
	}
	public int OPB0() {
		setOrFlags(cpu.register.a, cpu.register.b);
		cpu.register.a = (byte) (cpu.register.a | cpu.register.b);
		return 0;
	}
	public int OPB1() {
		setOrFlags(cpu.register.a, cpu.register.c);
		cpu.register.a = (byte) (cpu.register.a | cpu.register.c);
		return 0;
	}
	public int OPB2() {
		setOrFlags(cpu.register.a, cpu.register.d);
		cpu.register.a = (byte) (cpu.register.a | cpu.register.d);
		return 0;
	}
	public int OPB3() {
		setOrFlags(cpu.register.a, cpu.register.e);
		cpu.register.a = (byte) (cpu.register.a | cpu.register.e);
		return 0;
	}
	public int OPB4() {
		setOrFlags(cpu.register.a, cpu.register.h);
		cpu.register.a = (byte) (cpu.register.a | cpu.register.h);
		return 0;
	}
	public int OPB5() {
		setOrFlags(cpu.register.a, cpu.register.l);
		cpu.register.a = (byte) (cpu.register.a | cpu.register.l);
		return 0;
	}
	public int OPB6() {
		byte n = memory.readMemory(cpu.register.hl());
		setOrFlags(cpu.register.a, n);
		cpu.register.a = (byte) (cpu.register.a | n);
		return 0;
	}
	public int OPF6() {
		byte n = cpu.getValue8();
		setOrFlags(cpu.register.a, n);
		cpu.register.a = (byte) (cpu.register.a | n);
		return 0;
	}
	private int setXorFlags(byte a, byte b) {
		int result = a ^ b;
		cpu.register.zf = result == 0;
		cpu.register.nf = false;
		cpu.register.hf = false;
		cpu.register.cf = false;
		return 0;
	}
	public int OPAF() {
		setXorFlags(cpu.register.a, cpu.register.a);
		cpu.register.a = (byte) (cpu.register.a ^ cpu.register.a);
		return 0;
	}
	public int OPA8() {
		setXorFlags(cpu.register.a, cpu.register.b);
		cpu.register.a = (byte) (cpu.register.a ^ cpu.register.b);
		return 0;
	}
	public int OPA9() {
		setXorFlags(cpu.register.a, cpu.register.c);
		cpu.register.a = (byte) (cpu.register.a ^ cpu.register.c);
		return 0;
	}
	public int OPAA() {
		setXorFlags(cpu.register.a, cpu.register.d);
		cpu.register.a = (byte) (cpu.register.a ^ cpu.register.d);
		return 0;
	}
	public int OPAB() {
		setXorFlags(cpu.register.a, cpu.register.e);
		cpu.register.a = (byte) (cpu.register.a ^ cpu.register.e);
		return 0;
	}
	public int OPAC() {
		setXorFlags(cpu.register.a, cpu.register.h);
		cpu.register.a = (byte) (cpu.register.a ^ cpu.register.h);
		return 0;
	}
	public int OPAD() {
		setXorFlags(cpu.register.a, cpu.register.l);
		cpu.register.a = (byte) (cpu.register.a ^ cpu.register.l);
		return 0;
	}
	public int OPAE() {
		byte n = memory.readMemory(cpu.register.hl());
		setXorFlags(cpu.register.a, n);
		cpu.register.a = (byte) (cpu.register.a ^ n);
		return 0;
	}
	public int OPEE() {
		byte n = cpu.getValue8();
		setXorFlags(cpu.register.a, n);
		cpu.register.a = (byte) (cpu.register.a ^ n);
		return 0;
	}
	public int OPBF() {
		this.setSubFlags(cpu.register.a, cpu.register.a);
		return 0;
	}
	public int OPB8() {
		this.setSubFlags(cpu.register.a, cpu.register.b);
		return 0;
	}
	public int OPB9() {
		this.setSubFlags(cpu.register.a, cpu.register.c);
		return 0;
	}
	public int OPBA() {
		this.setSubFlags(cpu.register.a, cpu.register.d);
		return 0;
	}
	public int OPBB() {
		this.setSubFlags(cpu.register.a, cpu.register.e);
		return 0;
	}
	public int OPBC() {
		this.setSubFlags(cpu.register.a, cpu.register.h);
		return 0;
	}
	public int OPBD() {
		this.setSubFlags(cpu.register.a, cpu.register.l);
		return 0;
	}
	public int OPBE() {
		int n = memory.readMemory(cpu.register.hl());
		this.setSubFlags(cpu.register.a, n);
		return 0;
	}
	public int OPFE() {
		int n = cpu.getValue8();
		this.setSubFlags(cpu.register.a, n);
		return 0;
	}
	private int setIncFlags(int a) {
		int intermediateResult = a + 1;
		cpu.register.zf = intermediateResult == 0;
		cpu.register.nf = false;
		cpu.register.hf = (a & 0xF) + (1 & 0xF) > 0xF;
		return 0;
	}
	public int OP3C() {
		setIncFlags(cpu.register.a);
		cpu.register.a = (byte) ((cpu.register.a + 1) & 0xFF);
		return 0;
	}
	public int OP04() {
		setIncFlags(cpu.register.b);
		cpu.register.b = (byte) ((cpu.register.b + 1) & 0xFF);
		return 0;
	}
	public int OP0C() {
		setIncFlags(cpu.register.c);
		cpu.register.c = (byte) ((cpu.register.c + 1) & 0xFF);
		return 0;
	}
	public int OP14() {
		setIncFlags(cpu.register.d);
		cpu.register.d = (byte) ((cpu.register.d + 1) & 0xFF);
		return 0;
	}
	public int OP1C() {
		setIncFlags(cpu.register.e);
		cpu.register.e = (byte) ((cpu.register.e + 1) & 0xFF);
		return 0;
	}
	public int OP24() {
		setIncFlags(cpu.register.h);
		cpu.register.h = (byte) ((cpu.register.h + 1) & 0xFF);
		return 0;
	}
	public int OP2C() {
		setIncFlags(cpu.register.d);
		cpu.register.d = (byte) ((cpu.register.d + 1) & 0xFF);
		return 0;
	}
	public int OP34() {
		int n = memory.readMemory(cpu.register.hl());
		setIncFlags(n);
		memory.writeMemory(cpu.register.hl(), (byte) ((n + 1) & 0xFF));
		return 0;
	}
	public int setDecFlags(int a) {
		int intermediateResult = a - 1;
		cpu.register.nf = true;
		cpu.register.zf = intermediateResult == 0;
		cpu.register.hf = (a & 0xF) < (1 & 0xF);
		return 0;
	}
	public int OP3D() {
		setDecFlags(cpu.register.a);
		cpu.register.a = (byte) ((cpu.register.a - 1) & 0xFF);
		return 0;
	}
	public int OP05() {
		setDecFlags(cpu.register.b);
		cpu.register.b = (byte) ((cpu.register.b - 1) & 0xFF);
		return 0;
	}
	public int OP0D() {
		setDecFlags(cpu.register.c);
		cpu.register.c = (byte) ((cpu.register.c - 1) & 0xFF);
		return 0;
	}
	public int OP15() {
		setDecFlags(cpu.register.d);
		cpu.register.d = (byte) ((cpu.register.d - 1) & 0xFF);
		return 0;
	}
	public int OP1D() {
		setDecFlags(cpu.register.e);
		cpu.register.e = (byte) ((cpu.register.e - 1) & 0xFF);
		return 0;
	}
	public int OP25() {
		setDecFlags(cpu.register.h);
		cpu.register.h = (byte) ((cpu.register.h - 1) & 0xFF);
		return 0;
	}
	public int OP2D() {
		setDecFlags(cpu.register.l);
		cpu.register.l = (byte) ((cpu.register.l - 1) & 0xFF);
		return 0;
	}
	public int OP35() {
		int n = memory.readMemory(cpu.register.hl());
		setDecFlags(n);
		memory.writeMemory(cpu.register.hl(), (byte) ((n - 1) & 0xFF));
		return 0;
	}
	private int setAdd16Flags(int a, int n) {
		cpu.register.nf = false;
		cpu.register.hf = (a & 0xFFF) + (n & 0xFFF) > 0xFFF;
		cpu.register.cf = (a & 0xFFFF) + (n & 0xFFFF) > 0xFFFF;
		return 0;
	}
	public int OP09() {
		setAdd16Flags(cpu.register.hl(), cpu.register.bc());
		int intermediateResult = cpu.register.hl() + cpu.register.bc();
		intermediateResult = (cpu.register.hl() + cpu.register.bc()) & 0xFFFF;
		cpu.putHL(intermediateResult);
		return 0;
	}
	public int OP19() {
		setAdd16Flags(cpu.register.hl(), cpu.register.de());
		int intermediateResult = cpu.register.hl() + cpu.register.de();
		intermediateResult = (cpu.register.hl() + cpu.register.de()) & 0xFFFF;
		cpu.putHL(intermediateResult);
		return 0;
	}
	public int OP29() {
		setAdd16Flags(cpu.register.hl(), cpu.register.hl());
		int intermediateResult = cpu.register.hl() + cpu.register.hl();
		intermediateResult = (cpu.register.hl() + cpu.register.hl()) & 0xFFFF;
		cpu.putHL(intermediateResult);
		return 0;
	}
	public int OP39() {
		setAdd16Flags(cpu.register.hl(), cpu.register.sp);
		int intermediateResult = cpu.register.hl() + cpu.register.sp;
		intermediateResult = (cpu.register.hl() + cpu.register.sp) & 0xFFFF;
		cpu.putHL(intermediateResult);
		return 0;
	}
	public int OPE8() {
		byte n = cpu.getValue8();
		setAdd16Flags(cpu.register.sp, n);
		int intermediateResult = cpu.register.hl() + cpu.register.sp;
		intermediateResult = (cpu.register.hl() + cpu.register.sp) & 0xFFFF;
		cpu.putSP(intermediateResult);
		return 0;
	}
	public int OP03() {
		cpu.putBC(cpu.register.bc() + 1);
		return 0;
	}
	public int OP13() {
		cpu.putDE(cpu.register.de() + 1);
		return 0;
	}
	public int OP23() {
		cpu.putHL(cpu.register.hl() + 1);
		return 0;
	}
	public int OP33() {
		cpu.putSP(cpu.register.sp + 1);
		return 0;
	}
	public int OP0B() {
		cpu.putBC(cpu.register.bc() - 1);
		return 0;
	}
	public int OP1B() {
		cpu.putDE(cpu.register.de() - 1);
		return 0;
	}
	public int OP2B() {
		cpu.putHL(cpu.register.hl() - 1);
		return 0;
	}
	public int OP3B() {
		cpu.putSP(cpu.register.sp - 1);
		return 0;
	}
}
