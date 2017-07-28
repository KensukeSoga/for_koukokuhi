package jp.co.isid.kkh.customer.lion.controller.master;

import java.util.ArrayList;
import java.util.List;
import jp.co.isid.kkh.model.base.KKHException;
import jp.co.isid.kkh.customer.lion.model.master.LionDataCondition;
import jp.co.isid.kkh.customer.lion.model.master.LionManager;
import jp.co.isid.kkh.customer.lion.model.master.LionRegisterResult;
import jp.co.isid.kkh.customer.lion.model.master.LionTvMastDataInsertVO;
import jp.co.isid.kkh.customer.lion.model.master.LionTvMastDataVO;
import jp.co.isid.kkh.customer.lion.model.master.LionTvMastRegisterVO;
import jp.co.isid.nj.controller.command.Command;

/**
 * <P>
 * �}�X�^�f�[�^�o�^�R�}���h
 * </P>
 * <P>
 * <B>�C������</B><BR>
 * �E�V�K�쐬(2011/11/11 JSE H.Abe)<BR>
 * </P>
 *
 * @author JSE H.Abe
 */
public class LionTvMastRegisterCmd extends Command {

    private static final long serialVersionUID = 1L;

    /** �}�X�^�f�[�^�o�^�����pVO */
    private LionTvMastRegisterVO _vo;

    /** ���s���ʃL�[ */
    private static final String RESULT_KEY = "RESULT_KEY";

    /**
     * �}�X�^�f�[�^�o�^���������s���܂��B
     *
     * @throws KKHException �o�^�Ɏ��s�����ꍇ
     */
    public void execute() throws KKHException {

        LionManager manager = LionManager.getInstance();

        LionDataCondition mastercondition = new LionDataCondition();
        mastercondition.setEgCd(_vo.getEgCd());
        mastercondition.setTksKgyCd(_vo.getTksKgyCd());
        mastercondition.setTksBmnSeqNo(_vo.getTksBmnSeqNo());
        mastercondition.setTksTntSeqNo(_vo.getTksTntSeqNo());

        //�폜�J�n
        manager.deleteLionTvMastDataByCondition(mastercondition);

        //Insert�J�n
        if (_vo.getLionData() != null) {
            List<LionTvMastDataInsertVO> insertVOList = new ArrayList<LionTvMastDataInsertVO>();
            insertVOList =  editDefineInsertVo(_vo,_vo.get_sybt());

            manager.registerLionTvMast(insertVOList);
        }

        // ����I��
        getResult().set(RESULT_KEY, new LionRegisterResult());
    }

    /**
     * �}�X�^�f�[�^�o�^VO�̐ݒ�
     *
     * @param vo �}�X�^�f�[�^�o�^VO
     */
    public void setLionTvMastRegisterVO(LionTvMastRegisterVO vo) {
        _vo = vo;
    }

    /**
     * ���s���ʂ�Ԃ��܂��B
     *
     * @return ���s����
     */
    public LionRegisterResult getLionRegisterResult() {
        return (LionRegisterResult) super.getResult().get(RESULT_KEY);
    }

//	/**
//	 * �p�����[�^���̓`�F�b�N
//	 *
//	 * @throws KKHException �p�����[�^�w��G���[�̏ꍇ
//	 */
//	private void checkInput() throws KKHException {
//
//		//�p�����[�^�̕K�{�`�F�b�N
//		if (StringUtil.isBlank(_vo.getEsqId())) {
//			throw new KKHException("�p�����[�^�w��G���[", "BD-E0001");
//		}
//		if (StringUtil.isBlank(_vo.getAplId())) {
//			throw new KKHException("�p�����[�^�w��G���[", "BD-E0001");
//		}
//		if (StringUtil.isBlank(_vo.getEgCd())) {
//			throw new KKHException("�p�����[�^�w��G���[", "BD-E0001");
//		}
//		if (StringUtil.isBlank(_vo.getTksKgyCd())) {
//			throw new KKHException("�p�����[�^�w��G���[", "BD-E0001");
//		}
//		if (StringUtil.isBlank(_vo.getTksBmnSeqNo())) {
//			throw new KKHException("�p�����[�^�w��G���[", "BD-E0001");
//		}
//		if (StringUtil.isBlank(_vo.getTksTntSeqNo())) {
//			throw new KKHException("�p�����[�^�w��G���[", "BD-E0001");
//		}
//		if (StringUtil.isBlank(_vo.getMasterKey())) {
//			throw new KKHException("�p�����[�^�w��G���[", "BD-E0001");
//		}
//		try {
//			if (_vo.getLionData() == null && _vo.get_maxupdate() == DateFormat.getDateInstance().parse("1000/01/01 01:01:01")) {
//				throw new KKHException("�p�����[�^�w��G���[", "BD-E0001");
//			}
//		} catch (ParseException e) {
//			// TODO �����������ꂽ catch �u���b�N
//			e.printStackTrace();
//		}
//	}

//	/**
//	 * �G���[��񐶐�
//	 *
//	 * @param message ���b�Z�[�W
//	 * @param errorID �G���[�R�[�h
//	 * @return �G���[���
//	 */
//	private ErrorInfo createErrorInfo(String message, String errorID) {
//
//		ErrorInfo errorInfo = new ErrorInfo();
//		errorInfo.setError(true);
//		errorInfo.setErrorCode(errorID);
//		List<String> list = new ArrayList<String>();
//		list.add(message);
//		errorInfo.setNote(list);
//		return errorInfo;
//	}

    private List<LionTvMastDataInsertVO> editDefineInsertVo(LionTvMastRegisterVO masterRegisterVO, String Sybt)
    {
        List<LionTvMastDataInsertVO> insertVOList = new ArrayList<LionTvMastDataInsertVO>();

        List<LionTvMastDataVO> mstdatavo = masterRegisterVO.getLionData();

        for(LionTvMastDataVO mstvo : mstdatavo)
        {
            LionTvMastDataInsertVO addrow = new LionTvMastDataInsertVO();
            addrow.setTrkTimStmp(mstvo.getTrkTimStmp());
            addrow.setTrkPl(mstvo.getTrkPl());
            addrow.setTrkTnt(mstvo.getTrkTnt());
            addrow.setUpdTimStmp(mstvo.getUpdTimStmp());
            addrow.setUpdaPl(mstvo.getUpdaPl());
            addrow.setUpdTnt(mstvo.getUpdTnt());
            addrow.setEgCd(mstvo.getEgCd());
            addrow.setTksKgyCd(mstvo.getTksKgyCd());
            addrow.setTksBmnSeqNo(mstvo.getTksBmnSeqNo());
            addrow.setTksTntSeqNo(mstvo.getTksTntSeqNo());
            addrow.setBanCd(mstvo.getBanCd());
            addrow.setBanName(mstvo.getBanName());
            addrow.setHkyokuCd(mstvo.getHkyokuCd());
            addrow.setSeisakuhi(mstvo.getSeisakuhi());
            addrow.setHyojijyun(mstvo.getHyojijyun());
            addrow.setTanka(mstvo.getTanka());
            addrow.setType2(mstvo.getType2());
            insertVOList.add(addrow);
        }

        return insertVOList;
    }

//	/**
//	 * String����BigDecimal�ɕϊ�
//	 *
//	 * @param str �ϊ��O������
//	 * @return �ϊ��㐔�l
//	 */
//	private BigDecimal toBigDecimal(String str) {
//
//		// ���ݒ�̏ꍇ
//		if (StringUtil.isBlank(str)) {
//			return null;
//		}
//
//		return new BigDecimal(str);
//	}

}