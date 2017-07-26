using System;
using System.Collections.Generic;
using System.Text;
using Isid.KKH.Common.KKHView.Common;

namespace Isid.KKH.Mac.View.Mast
{
    public class MastNarrowDownNaviParameter : KKHNaviParameter
    {
        #region "vpeB"
        /// <summary>
        /// XÜR[h
        /// </summary>
        private string _tenCd;
        /// <summary>
        /// XÜR[h
        /// </summary>
        public string tenCd
        {
            get { return _tenCd; }
            set { _tenCd = value; }
        }

        /// <summary>
        /// XÜR[h2
        /// </summary>
        private string _tenCd2;
        /// <summary>
        /// XÜR[h2
        /// </summary>
        public string tenCd2
        {
            get { return _tenCd2; }
            set { _tenCd2 = value; }
        }

        /// <summary>
        /// XÜR[hR{{bNX
        /// </summary>
        private int  _tenCdCmb;
        /// <summary>
        /// XÜR[hR{{bNX
        /// </summary>
        public int tenCdCmb
        {
            get { return _tenCdCmb; }
            set { _tenCdCmb = value; }
        }

        /// <summary>
        /// XÜ¼
        /// </summary>
        private string _tenName;
        /// <summary>
        /// XÜ¼
        /// </summary>
        public string tenName
        {
            get { return _tenName; }
            set { _tenName = value; }
        }

        /// <summary>
        /// eg[Ö
        /// </summary>
        private bool _terKanto;
        /// <summary>
        /// eg[Ö
        /// </summary>
        public bool terKanto
        {
            get { return _terKanto; }
            set { _terKanto = value; }
        }

        /// <summary>
        /// eg[Ö¼
        /// </summary>
        private bool _terKansai;
        /// <summary>
        /// eg[Ö¼
        /// </summary>
        public bool terKansai
        {
            get { return _terKansai; }
            set { _terKansai = value; }
        }

        /// <summary>
        /// eg[
        /// </summary>
        private bool _terTyuou;
        /// <summary>
        /// eg[
        /// </summary>
        public bool terTyuou
        {
            get { return _terTyuou; }
            set { _terTyuou = value; }
        }

        /// <summary>
        /// eg[»Ì¼
        /// </summary>
        private bool _terSonota;
        /// <summary>
        /// eg[»Ì¼
        /// </summary>
        public bool terSonota
        {
            get { return _terSonota; }
            set { _terSonota = value; }
        }

        /// <summary>
        /// XÜæªnæ{
        /// </summary>
        private bool _kbnTikuhonbu;
        /// <summary>
        /// XÜæªnæ{
        /// </summary>
        public bool kbnTikuhonbu
        {
            get { return _kbnTikuhonbu; }
            set { _kbnTikuhonbu = value; }
        }

        /// <summary>
        /// XÜæªMC¼cX
        /// </summary>
        private bool _kbnMc;
        /// <summary>
        /// XÜæªMC¼cX
        /// </summary>
        public bool kbnMc
        {
            get { return _kbnMc; }
            set { _kbnMc = value; }
        }

        /// <summary>
        /// XÜæªCZV[
        /// </summary>
        private bool _kbnLicensee;
        /// <summary>
        /// XÜæªCZV[
        /// </summary>
        public bool kbnLicensee
        {
            get { return _kbnLicensee; }
            set { _kbnLicensee = value; }
        }

        /// <summary>
        /// XÜæª»Ì¼
        /// </summary>
        private bool _kbnSonota;
        /// <summary>
        /// XÜæª»Ì¼
        /// </summary>
        public bool kbnSonota
        {
            get { return _kbnSonota; }
            set { _kbnSonota = value; }
        }

        #endregion "vpeB"

    }
}